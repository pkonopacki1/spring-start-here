package com.konopackipio1.proxies;

import org.springframework.stereotype.Component;

import com.konopackipio1.model.Comment;

@Component
public class EmailCommentNotificationProxy implements CommentNotificationProxy {

    @Override
    public void sendComment(Comment comment) {
        System.out.println("Sending notification for comment: " + comment.getText());
    }

}
