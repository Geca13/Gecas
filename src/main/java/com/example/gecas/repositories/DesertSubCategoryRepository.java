package com.example.gecas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.gecas.entities.DesertSubCategory;

@Repository
public interface DesertSubCategoryRepository extends JpaRepository<DesertSubCategory, Long> {

}
