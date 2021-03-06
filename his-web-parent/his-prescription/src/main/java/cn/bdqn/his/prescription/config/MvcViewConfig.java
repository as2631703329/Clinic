package cn.bdqn.his.prescription.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import cn.bdqn.his.common.interceptor.SsoCookieWrapperInterceptor;

@Configuration
public class MvcViewConfig implements WebMvcConfigurer {
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addRedirectViewController("","index.html");
		registry.addViewController("/add").setViewName("/add");
	}

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new SsoCookieWrapperInterceptor())
				.addPathPatterns("/api/**");
	}
}
