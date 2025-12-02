package com.example.dessertBackend.dessert.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.AllArgsConstructor;

@Entity // DB 테이블과 매핑
@Table(name = "desserts")
@Getter @Setter
@NoArgsConstructor // 기본 생성자
@AllArgsConstructor
public class Dessert {

    @Id // 기본 키
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name; // 디저트 이름

    private int price; // 가격

    private String description; // 설명

    private String imageUrl; // 이미지 URL
}