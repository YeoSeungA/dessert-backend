package com.example.dessertBackend.dessert.controller;

import com.example.dessertBackend.dessert.entity.Dessert;
import com.example.dessertBackend.dessert.repository.DessertRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController // 이 클래스가 REST API 컨트롤러임을 선언
@RequestMapping("/api/desserts") // 기본 URL 경로 설정
@RequiredArgsConstructor // Repository를 주입받기 위한 Lombok 어노테이션
public class DessertController {

    private final DessertRepository dessertRepository;

    // 초기 테스트를 위해 가짜 데이터를 DB에 저장하는 메서드
    @GetMapping("/init")
    public String initializeDesserts() {
        if (dessertRepository.count() == 0) { // 데이터가 없을 때만 실행
            dessertRepository.save(new Dessert(null, "마카롱", 3000, "달콤한 마카롱 세트", "url_macaron"));
            dessertRepository.save(new Dessert(null, "크로플", 5500, "겉바속촉 크로플", "url_croffle"));
            return "2개의 디저트 데이터가 생성되었습니다.";
        }
        return "이미 데이터가 존재합니다.";
    }

    // GET /api/desserts 요청을 처리 (디저트 목록 조회)
    @GetMapping
    public List<Dessert> getAllDesserts() {
        return dessertRepository.findAll(); // DB에 저장된 모든 디저트 리스트 반환
    }
}
