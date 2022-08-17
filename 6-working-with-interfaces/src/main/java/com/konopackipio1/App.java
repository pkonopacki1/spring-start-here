package com.konopackipio1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.konopackipio1.model.Comment;
import com.konopackipio1.proxies.CommentNotificationProxy;
import com.konopackipio1.proxies.EmailCommentNotificationProxy;
import com.konopackipio1.repositories.CommentRepository;
import com.konopackipio1.repositories.DBCommentRepository;
import com.konopackipio1.services.CommentService;

public class App {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfiguration.class);

        Comment comment = new Comment("Thomas", "This sucks!");

        var commentService = context.getBean(CommentService.class);

        commentService.publishComment(comment);

        context.close();
    }

}
