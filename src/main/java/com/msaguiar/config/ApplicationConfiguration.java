package com.msaguiar.config;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.liquibase.LiquibaseProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.task.TaskExecutor;

import liquibase.Liquibase;
import liquibase.integration.spring.SpringLiquibase;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableAutoConfiguration
// @EnableJpaRepositories("com.msaguiar.repository")
// @EnableTransactionManagement
@EnableSwagger2
public class ApplicationConfiguration {

	private final Logger log = LoggerFactory.getLogger(ApplicationConfiguration.class);

	@Bean
	public Docket newsApi() {
		return new Docket(DocumentationType.SWAGGER_2).groupName("api").apiInfo(apiInfo()).select()
				.paths(PathSelectors.regex("/api.*")).build();
	}

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder().title("Spring REST Sample with Swagger")
				.description("Spring REST Sample with Swagger")
				.termsOfServiceUrl("http://www-03.ibm.com/software/sla/sladb.nsf/sla/bm?Open")
				.license("Apache License Version 2.0")
				.licenseUrl("https://github.com/IBM-Bluemix/news-aggregator/blob/master/LICENSE").version("2.0")
				.build();
	}

}
