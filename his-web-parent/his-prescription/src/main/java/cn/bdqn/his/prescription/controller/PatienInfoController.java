package cn.bdqn.his.prescription.controller;


import cn.bdqn.his.prescription.entity.hos.PatienInfo;
import cn.bdqn.his.prescription.service.PatienInfoServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@Api(tags = "患者表hos_patien_info")
@RestController
@RequestMapping("/api/prescription/hos/patien")
public class PatienInfoController {

    @Resource
    PatienInfoServiceImpl patienInfoService;//患者表service

    @ApiOperation(value = "查询患者",notes = "查询所有患者")
    @GetMapping("/info")
    public List<PatienInfo> getByInfo(String level, String createDate, String content) {
        return  patienInfoService.getAllPatienInfo(level,createDate, content);
    }
//    @ApiImplicitParam(name="id",value = "用户id",required = true,defaultValue = "1")//对应方法参数
}
