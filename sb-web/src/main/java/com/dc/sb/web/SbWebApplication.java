package com.dc.sb.web;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@DubboComponentScan(basePackages = "com.dc.sb.web")
public class SbWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbWebApplication.class, args);
	}
}
