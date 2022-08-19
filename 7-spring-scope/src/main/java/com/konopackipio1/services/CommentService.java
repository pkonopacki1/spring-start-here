package com.konopackipio1.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.konopackipio1.repositories.CommentRepository;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Service
@Getter
@RequiredArgsConstructor
public class CommentService {

    private final CommentRepository commentRepository;

}
