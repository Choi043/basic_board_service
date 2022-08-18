package com.example.basic_board_project.repository;

import com.example.basic_board_project.entity.Article;
import org.springframework.data.repository.CrudRepository;

public interface ArticleRepository extends CrudRepository<Article, Long> {

}
