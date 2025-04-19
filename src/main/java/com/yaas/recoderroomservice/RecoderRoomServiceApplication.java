package com.yaas.recoderroomservice;

import com.yaas.recoderroomservice.file.FileUploadProperties;
import java.util.Arrays;
import java.util.List;
import javax.servlet.Filter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@SpringBootApplication
@EnableFeignClients
@EnableConfigurationProperties({FileUploadProperties.class})
public class RecoderRoomServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RecoderRoomServiceApplication.class, args);
	}

	@Bean
	public FilterRegistrationBean FilterRegistrationBean() {
		CorsConfiguration config = new CorsConfiguration();
		config.setAllowCredentials(Boolean.valueOf(true));
		config.addAllowedOrigin("*");
		config.setAllowedHeaders(Arrays.asList(new String[] { "Authorization", "Accept", "Content-Type", "Origin", "XSRF-TOKEN", "X-XSRF-TOKEN", "X-Requested-With" }));
		config.addAllowedMethod("*");
		List<String> allowHeaderList = Arrays.asList(new String[] { "x-xsrf-token", "Origin", "Accept", "Content-Type", "X-Requested-With", "Access-Control-Allow-Method", "Access-Control-Allow-Headers", "Access-Control-Request-Method", "Access-Control-Request-Headers"});
		config.setExposedHeaders(allowHeaderList);
		UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
		source.registerCorsConfiguration("/**", config);
		FilterRegistrationBean bean = new FilterRegistrationBean(new CorsFilter(source), new org.springframework.boot.web.servlet.ServletRegistrationBean[0]);
		bean.setOrder(0);
		return bean;
	}
}
