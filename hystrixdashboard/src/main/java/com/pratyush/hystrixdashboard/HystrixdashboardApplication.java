package com.pratyush.hystrixdashboard;

import org.apache.http.client.HttpClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.Bean;

@SpringBootApplication

@EnableEurekaClient
@EnableHystrixDashboard
public class HystrixdashboardApplication {

	public static void main(String[] args) {
		SpringApplication.run(HystrixdashboardApplication.class, args);
	}
	
}
