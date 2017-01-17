package com.yikeshangshou.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class HelloWorldApplication {

  @RequestMapping("/")
  String hello() {
    return "Hello World!";
  }

  public static void main(String[] args) throws Exception {
    SpringApplication.run(HelloWorldApplication.class, args);
  }

}
