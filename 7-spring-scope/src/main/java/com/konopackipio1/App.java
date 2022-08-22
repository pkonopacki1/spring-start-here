package com.konopackipio1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.konopackipio1.repositories.CommentRepository;
import com.konopackipio1.services.CommentService;
import com.konopackipio1.services.UserService;

public class App {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        var cs1 = context.getBean(CommentService.class);
        var cs2 = context.getBean(CommentService.class);

        System.out.println(cs1 == cs2);

        context.close();
    }
}
