package com.konopackipio1.repositories;

import com.konopackipio1.model.Comment;

public class DBCommentRepository implements CommentRepository {

    @Override
    public void storeComment(Comment comment) {
        System.out.println("Storing comment: " + comment.getText());
    }

}
