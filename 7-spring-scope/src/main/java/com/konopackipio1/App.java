package com.konopackipio1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.konopackipio1.repositories.CommentRepository;
import com.konopackipio1.services.CommentService;
import com.konopackipio1.services.UserService;

public class App {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        var s1 = context.getBean(CommentService.class);
        var s2 = context.getBean(UserService.class);

        System.out.println(s1.getCommentRepository() == s2.getCommentRepository());

        context.close();
    }
}
