package cn.bdqn.his.masterdata.controller;

import cn.bdqn.his.common.response.Response;
import cn.bdqn.his.common.response.ResponseEnum;
import cn.bdqn.his.masterdata.entity.Advice;
import cn.bdqn.his.masterdata.service.AdviceServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@Api("医嘱接口")
@RestController
@RequestMapping("/api/advice")
public class AdviceController {



    @Resource
    AdviceServiceImpl adviceService;


    @RequestMapping(value = "/adviceList",method = {RequestMethod.GET,RequestMethod.POST})
    public Response adviceList(String content,Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<Advice> list =  adviceService.adviceList(content);
        PageInfo<Advice> pageInfo = new PageInfo<>(list);
        return new Response(ResponseEnum.SUCCESS).setResponseBody(pageInfo);
    }

    @RequestMapping(value = "/insertAdvice")
    public Response insertAdvice(String content, String createDate, Integer create_id){
        int count = adviceService.insertAdvice("少喝啤酒","2020-4-19",1);
        String message = null;
        if (count>0){
            message="创建医嘱成功！";
        }else{
            message="创建医嘱失败！";
        }
        return new Response(ResponseEnum.SUCCESS).setResponseBody(message);
    }




}
