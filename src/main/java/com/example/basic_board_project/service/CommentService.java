package com.example.basic_board_project.service;

import com.example.basic_board_project.repository.ArticleRepository;
import com.example.basic_board_project.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentService {
    @Autowired
    private CommentRepository commentRepository;

    @Autowired
    private ArticleRepository articleRepository;
}
