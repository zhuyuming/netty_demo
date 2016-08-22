package com.eleme.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.request.async.DeferredResult;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@SpringBootApplication
@EnableSwagger2
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	public Docket testApi() {
		return new Docket(DocumentationType.SWAGGER_2)
				.groupName("test")
				.genericModelSubstitutes(DeferredResult.class)
				//.genericModelSubstitutes(ResponseEntity.class)
				.useDefaultResponseMessages(false)
				.forCodeGeneration(true)
				.pathMapping("/test")//api测试请求地址
				.select()
				.paths(PathSelectors.regex("/common/.*"))//过滤的接口
				.build()
				.apiInfo(testApiInfo());
	}


	@Bean
	public Docket demoApi() {
		return new Docket(DocumentationType.SWAGGER_2)
				.groupName("demo")
				.genericModelSubstitutes(DeferredResult.class)
				//  .genericModelSubstitutes(ResponseEntity.class)
				.useDefaultResponseMessages(false)
				.forCodeGeneration(false)
				.pathMapping("/")
				.select()
				.paths(PathSelectors.regex("/comm.*"))//过滤的接口
				.build()
				.apiInfo(demoApiInfo());
	}

	private ApiInfo testApiInfo() {
		Contact contact = new Contact("王念", "http://my.oschina.net/wangnian", "2251181679@qq.com");
		ApiInfo apiInfo = new ApiInfo("某API接口",//大标题
				"REST风格API",//小标题
				"0.1",//版本
				"www.baidu.com",
				contact,//作者
				"主页",//链接显示文字
				""//网站链接
		);
		return apiInfo;
	}

	private ApiInfo demoApiInfo() {
		Contact contact = new Contact("王念", "http://my.oschina.net/wangnian", "2251181679@qq.com");
		ApiInfo apiInfo = new ApiInfo("某API接口",//大标题
				"REST风格API",//小标题
				"0.1",//版本
				"www.baidu.com",
				contact,//作者
				"主页",//链接显示文字
				""//网站链接
		);
		return apiInfo;
	}
}
