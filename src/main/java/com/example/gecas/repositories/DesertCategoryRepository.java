package com.example.gecas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.gecas.entities.DesertCategory;

@Repository
public interface DesertCategoryRepository extends JpaRepository<DesertCategory, Long> {

}
