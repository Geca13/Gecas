package com.example.gecas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.gecas.entities.FoodSubCategory;

@Repository
public interface FoodSubCategoryRepository extends JpaRepository<FoodSubCategory, Long> {

}
