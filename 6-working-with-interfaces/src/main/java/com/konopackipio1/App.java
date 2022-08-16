package com.konopackipio1;

import com.konopackipio1.model.Comment;
import com.konopackipio1.proxies.CommentNotificationProxy;
import com.konopackipio1.proxies.EmailCommentNotificationProxy;
import com.konopackipio1.repositories.CommentRepository;
import com.konopackipio1.repositories.DBCommentRepository;
import com.konopackipio1.services.CommentService;

public class App {

    public static void main(String[] args) {
        CommentRepository commentRepository = new DBCommentRepository();
        CommentNotificationProxy commentNotificationProxy = new EmailCommentNotificationProxy();

        CommentService commentService = new CommentService(commentRepository, commentNotificationProxy);

        Comment comment = new Comment("Thomas", "This sucks!");

        commentService.publishComment(comment);
    }

}
