package com.example.xonmin.springbootstart;

import com.apple.eawt.Application;
import com.example.xonmin.springbootstart.demo.Holoman;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;

import java.io.IOException;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
//springbootconfiguration + componentScan + EnableAutoConfiguration
public class SpringbootstartApplication {

    public static void main(String[] args)  {
      SpringApplication application = new SpringApplication(SpringbootstartApplication.class);
      application.setWebApplicationType(WebApplicationType.SERVLET);  //기본적으로 서블릿으로 돈다.
      application.run(args);
    }



}
