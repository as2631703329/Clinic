package cn.bdqn.his.medicine.controller;

import cn.bdqn.his.common.response.Response;
import cn.bdqn.his.common.response.ResponseEnum;
import cn.bdqn.his.medicine.entity.DrugCate;
import cn.bdqn.his.medicine.entity.PrescriType;
import cn.bdqn.his.medicine.service.DrugCateService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.HttpClientUtils;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Api(tags = "药品分类表hos_drug_cate")
@RestController
@RequestMapping("/api/masterdata/hos/drug")
public class DrugCateController {
    @Autowired
    DrugCateService drugCateService;//分类表service
    @ApiOperation(value = "根据处方id查询药品不同类别",notes = "查询所有药品类型")
    @RequestMapping(value = "/cate",method = {RequestMethod.GET,RequestMethod.POST})
    @ApiImplicitParams({
            @ApiImplicitParam(name = "pageNum", value = "当前页", required = true, defaultValue = "1"),
            @ApiImplicitParam(name = "pageSize", value = "每页显示数", required = true, defaultValue = "3"),
            @ApiImplicitParam(name = "id", value = "处方实体类id", required = true, defaultValue = "0")
    })
    public Response getAllDrugCateByprescriTypeId(Integer pageNum, Integer pageSize, PrescriType prescriType){
        PageHelper.startPage(pageNum,pageSize);
        List<DrugCate> list=drugCateService.getAllDrugCateByprescriTypeId(prescriType);
        PageInfo<DrugCate> pageInfo = new PageInfo<>(list);
        return new Response(ResponseEnum.SUCCESS).setResponseBody(pageInfo);
    }





}
