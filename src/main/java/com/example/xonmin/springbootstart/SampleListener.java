package com.example.xonmin.springbootstart;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.boot.context.event.ApplicationStartingEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;


@Component
public class SampleListener { // implements ApplicationListener<ApplicationStartedEvent> 제네릭 타입이 중요하다

        //application 이 bean으로 등록되기 이전에 실행되는 리스너들은
        //빈으로 등록이 되지않아서 실행이 되지 않는다.


  /*  @Override
    public void onApplicationEvent(ApplicationStartedEvent applicationStartedEvent) {
        System.out.println("========================");
        System.out.println("Application Starting");
        System.out.println("========================");
    } */

    public SampleListener(ApplicationArguments arguments) {

        System.out.println("foo" + arguments.containsOption("foo"));
        System.out.println("bar"+ arguments.containsOption("bar"));
    }
}
