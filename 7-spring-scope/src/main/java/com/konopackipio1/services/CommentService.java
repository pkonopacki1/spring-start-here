package com.konopackipio1.services;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.konopackipio1.repositories.CommentRepository;

import lombok.Getter;

@Service
@Lazy
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
@Getter
public class CommentService {

    private final CommentRepository commentRepository;

    public CommentService(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
        System.out.println("Comment service created");
    }

}
