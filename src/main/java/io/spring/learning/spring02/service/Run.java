package io.spring.learning.spring02.service;

import io.spring.learning.spring02.domain.Game;
import lombok.var;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:application.properties")
public class Run {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("io.spring.learning.spring02");
        Game obj = context.getBean(Game.class);
        System.out.println(obj.playGame().getTeamName());

    }
}
