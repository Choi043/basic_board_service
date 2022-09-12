package com.example.basic_board_project.repository;
import com.example.basic_board_project.repository.CommentRepository;
import com.example.basic_board_project.entity.Article;
import com.example.basic_board_project.entity.Comment;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
@DataJpaTest
class CommentRepositoryTest {
    @Autowired
    CommentRepository commentRepository;
    @Test
    void findByArticleId() {
    }
    @Test
    void findByNickname() {
    }
}