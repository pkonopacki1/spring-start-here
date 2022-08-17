package com.konopackipio1.repositories;

import org.springframework.stereotype.Component;

import com.konopackipio1.model.Comment;

@Component
public class DBCommentRepository implements CommentRepository {

    @Override
    public void storeComment(Comment comment) {
        System.out.println("Storing comment: " + comment.getText());
    }

}
