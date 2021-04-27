package com.example.gecas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.gecas.entities.DrinkSubCategory;

@Repository
public interface DrinkSubCategoryRepository extends JpaRepository<DrinkSubCategory, Long> {

}
