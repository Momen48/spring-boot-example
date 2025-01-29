package com.Amigos;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication 
@RestController
public class MainClass {
    public static void main(String[] args){
        SpringApplication.run(MainClass.class, args);
    }

    @GetMapping("/")
    public String greet(){
       return "Hello";
    }
}
