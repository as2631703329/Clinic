package cn.bdqn.his.prescription.controller;

import cn.bdqn.his.prescription.entity.hos.PreTemplate;
import cn.bdqn.his.prescription.service.PreTemplateService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Api(tags = "处方表hos_pre_template")
@RestController
@RequestMapping("/api/prescription/hos/pre")
public class PreTemplateController {
    @Autowired
    PreTemplateService preTemplateService;//处方

    @ApiOperation(value = "查询不同处方id查询摸板及摸板下的详情",notes = "查询所有药品类型")
    @GetMapping("/templat")
    @ApiImplicitParams({
//            @ApiImplicitParam(name = "pageNum", value = "当前页", required = true, defaultValue = "1"),
//            @ApiImplicitParam(name = "pageSize", value = "每页显示数", required = true, defaultValue = "3"),
            @ApiImplicitParam(name = "id", value = "处方id",required = true, defaultValue = "")
    })
    public  Map<String,List<PreTemplate>> getAllDrugCateByprescriTypeId(Integer id){
        Map<String,List<PreTemplate>> map=new HashMap<>();
        if(id==0){
            map.put("data", preTemplateService.getAllPreTemplatesMenWestern());
            map.put("list", preTemplateService.getAllPreTemplatesMenEast());

        }
        if(id==1){
            System.out.println("1"+ preTemplateService.getAllPreTemplatesMenWestern());
            map.put("list", preTemplateService.getAllPreTemplatesMenWestern());
        }
        if(id==2){
            map.put("list", preTemplateService.getAllPreTemplatesMenEast());

        }

        return map;
    }

}
