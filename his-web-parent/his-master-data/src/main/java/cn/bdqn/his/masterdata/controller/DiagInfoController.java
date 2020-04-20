package cn.bdqn.his.masterdata.controller;


import cn.bdqn.his.common.response.Response;
import cn.bdqn.his.common.response.ResponseEnum;
import cn.bdqn.his.masterdata.entity.Addfess;
import cn.bdqn.his.masterdata.entity.DiagInfo;
import cn.bdqn.his.masterdata.service.DiagInfoServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@Api("疾病接口")
@RestController
@RequestMapping("/api/diagInfo")
public class DiagInfoController {

    @Resource
    DiagInfoServiceImpl diagInfoService;

    @RequestMapping(value = "/diagInfoList",method = {RequestMethod.GET,RequestMethod.POST})
    public Response diagInfoList(String content,Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<DiagInfo> list =  diagInfoService.diagInfoList(content);
        PageInfo<DiagInfo> pageInfo = new PageInfo<>(list);
        return new Response(ResponseEnum.SUCCESS).setResponseBody(pageInfo);
    }

}
