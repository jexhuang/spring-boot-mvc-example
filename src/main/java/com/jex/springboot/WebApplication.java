package com.jex.springboot;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.jex")
//@EnableJpaRepositories(basePackages = "com.jex.model.repository", includeFilters = {
//		@ComponentScan.Filter(type = FilterType.ANNOTATION, value = Repository.class) })
//@EntityScan("com.jex.model.entity")
//@EnableTransactionManagement
public class WebApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(WebApplication.class);
	}

}