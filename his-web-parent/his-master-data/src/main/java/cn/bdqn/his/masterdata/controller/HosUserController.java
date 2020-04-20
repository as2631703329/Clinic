package cn.bdqn.his.masterdata.controller;

import cn.bdqn.his.common.response.Response;
import cn.bdqn.his.common.response.ResponseEnum;
import cn.bdqn.his.masterdata.entity.DiagInfo;
import cn.bdqn.his.masterdata.entity.Role;
import cn.bdqn.his.masterdata.entity.User;
import cn.bdqn.his.masterdata.service.HosUserServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@Api("员工接口")
@RestController
@RequestMapping("/api/hosuser")
public class HosUserController {

    @Resource
    HosUserServiceImpl hosUserServiceImpl;

    @RequestMapping(value = "/hosUserList",method = {RequestMethod.GET,RequestMethod.POST})
    public Response hosUserList(String content, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<User> list =  hosUserServiceImpl.userList(content);
        PageInfo<User> pageInfo = new PageInfo<>(list);
        return new Response(ResponseEnum.SUCCESS).setResponseBody(pageInfo);
    }

    @RequestMapping(value = "/roleList",method = {RequestMethod.GET,RequestMethod.POST})
    public Response roleList(String id, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<Role> list =  hosUserServiceImpl.roleList(id);
        PageInfo<Role> pageInfo = new PageInfo<>(list);
        return new Response(ResponseEnum.SUCCESS).setResponseBody(pageInfo);
    }

}
