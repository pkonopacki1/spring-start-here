package com.konopackipio1.services;

import org.springframework.stereotype.Service;

import com.konopackipio1.model.Comment;
import com.konopackipio1.proxies.CommentNotificationProxy;
import com.konopackipio1.repositories.CommentRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class CommentService {

    private final CommentRepository commentRepository;
    private final CommentNotificationProxy commentNotificationProxy;

    public void publishComment(Comment comment) {
        commentRepository.storeComment(comment);
        commentNotificationProxy.sendComment(comment);
    }

}
