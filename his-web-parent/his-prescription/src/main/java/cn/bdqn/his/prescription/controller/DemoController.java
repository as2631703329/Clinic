package cn.bdqn.his.prescription.controller;

import cn.bdqn.his.common.response.ResponseEnum;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.HttpClientUtils;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import cn.bdqn.his.common.http.HttpClientHelper;
import cn.bdqn.his.common.response.Response;

import javax.servlet.http.HttpServletRequest;

/**
 * api调用demo
 * @author Administrator
 *
 */
@Api
@RestController
@Slf4j
@RequestMapping("/api")
public class DemoController {
	@Value("${server.medicine.url}")
	private String serverMedicineUrl;
	@Value("${server.masterdata.url}")
	private String serverMasterdataUrl;

	@Autowired private HttpClientHelper httpClientHelper;

//	@GetMapping("api/masterdata/users")
//	public Response getMasterdataUsers() {
//		return httpClientHelper.getForResponse(serverMasterdataUrl + "/api/masterdata/users");
//	}
//
//	@GetMapping("api/medicine/users")
//	public Response getUsers() {
//		return httpClientHelper.getForResponse(serverMedicineUrl + "/api/medicine/users");
//	}

	@ApiOperation(value = "远程调用医嘱分页查询",response = Response.class)
	@RequestMapping(value = "/adviceListHttp",method = {RequestMethod.GET,RequestMethod.POST})
	public Response adviceListHttp(String content, Integer pageNum, Integer pageSize, HttpServletRequest request) {
		CloseableHttpClient httpClient = null;
		CloseableHttpResponse response = null;
		try {
			httpClient = HttpClientBuilder.create().build();
			StringBuffer params = new StringBuffer("?");
			params.append("pageNum=").append(pageNum==null?1:pageNum);
			params.append("&pageSize=").append(pageSize==null?2:pageSize);
			params.append("&content=").append(content==null?"":content.trim());
			String ssoCookie = (String) request.getAttribute("ssoCookies");
			System.out.println(1);
			HttpGet httpGet = new HttpGet(serverMasterdataUrl + "/api/advice/advice" +params);
			System.out.println(1);
			httpGet.addHeader("Cookie",ssoCookie);      //带上cookie才能访问
			response = httpClient.execute(httpGet);
			System.out.println(response);
			if (response.getStatusLine().getStatusCode()==200){
				HttpEntity entity = response.getEntity();
				String result = EntityUtils.toString(entity);
				return new ObjectMapper().readValue(result,Response.class);
			}

		}catch (Exception e){
			e.printStackTrace();
		}finally {
			HttpClientUtils.closeQuietly(response);
			HttpClientUtils.closeQuietly(httpClient);
		}
		return new Response(ResponseEnum.ERROR).setResponseBody("出错了");
	}

}
