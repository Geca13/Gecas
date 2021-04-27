package com.example.gecas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.gecas.entities.DrinkCategory;

@Repository
public interface DrinkCategoryRepository extends JpaRepository<DrinkCategory, Long> {

}
