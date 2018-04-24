package com.wipro.coe.microservices.data.promotions;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@EnableDiscoveryClient
@EnableAutoConfiguration
@Slf4j
public class CoeSpringDataMysqlRestApplications {

	public static void main(String[] args) {
		//ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new ClassPathResource("resources/spring-config.xml").getPath());
		SpringApplication.run(CoeSpringDataMysqlRestApplications.class, args);
	}
	
	@Autowired PromotionRepository promotionrepository ;
	
	@Autowired
	private DiscoveryClient discoveryClient;
	
	@Value("${spring.application.name:coe-cassandra-promotions}")
	private String appName;

	
	

	
}