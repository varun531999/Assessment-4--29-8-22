package com.varun.jgc.junit.spring.main;



import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.Configuration;

import com.varun.jgc.junit.spring.service.SampleService;
import com.varun.jgc.junit.spring.service.SampleServiceImpl;



@Configuration

public class AppConfig {

 @Bean

 public SampleService getSampleService() {

 return new SampleServiceImpl();

 }

}