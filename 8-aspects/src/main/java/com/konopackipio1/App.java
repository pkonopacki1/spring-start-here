package com.konopackipio1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.konopackipio1.models.Comment;
import com.konopackipio1.services.CommentService;

public class App {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        var service = context.getBean(CommentService.class);

        Comment comment = new Comment();
        comment.setText("Hello everyone");
        comment.setAuthor("Waldi");

        service.publishComment(comment);

        context.close();
    }
}
