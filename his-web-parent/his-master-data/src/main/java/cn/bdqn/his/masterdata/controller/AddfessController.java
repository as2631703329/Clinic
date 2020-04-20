package cn.bdqn.his.masterdata.controller;

import cn.bdqn.his.common.response.Response;
import cn.bdqn.his.common.response.ResponseEnum;
import cn.bdqn.his.masterdata.entity.Addfess;
import cn.bdqn.his.masterdata.service.AddfessServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@Api("附加费用接口")
@RestController
@RequestMapping("/api/addfess")
public class AddfessController {
    @Resource
    AddfessServiceImpl addfessServiceImpl;


    @RequestMapping(value = "/addfessList",method = {RequestMethod.GET,RequestMethod.POST})
    public Response addfessList(String name,String type,Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<Addfess> list =  addfessServiceImpl.addfessList(type,name);
        PageInfo<Addfess> pageInfo = new PageInfo<>(list);
        return new Response(ResponseEnum.SUCCESS).setResponseBody(pageInfo);
    }
}
