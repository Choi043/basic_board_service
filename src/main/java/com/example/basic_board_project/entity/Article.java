package com.example.basic_board_project.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor  // default 생성자 추가
@ToString
@Getter
public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // DB에서 id 자동 생성 어노테이션
    private Long id;

    @Column
    private String title;

    @Column
    private String content;
}
