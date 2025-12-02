package com.example.dessertBackend.dessert.repository;

import com.example.dessertBackend.dessert.entity.Dessert;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// JpaRepository를 상속받아 기본 CRUD 기능을 자동 제공받습니다.
@Repository
public interface DessertRepository extends JpaRepository<Dessert, Long> {

}
