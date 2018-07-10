package com.arun.test.config;
/**
 *  @author Arunraja
 *  @Class	SwaggerConfiguration
 *  @Desc   Api documentation
 */
import static com.google.common.base.Predicates.and;
import static springfox.documentation.builders.RequestHandlerSelectors.basePackage;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.google.common.base.Predicate;

import springfox.documentation.RequestHandler;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfiguration {
	@Bean
	public Docket api() {
        @SuppressWarnings("unchecked")
        Predicate<RequestHandler> apiPredicate = and(basePackage("com.arun.test.rest"));
		
		return new Docket(DocumentationType.SWAGGER_2).select().apis(apiPredicate)
				.paths(PathSelectors.any()).build();
	}

}
