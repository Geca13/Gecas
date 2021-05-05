package com.example.gecas.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.gecas.entities.FoodItem;

@Repository
public interface FoodItemRepository extends JpaRepository<FoodItem, Long> {

	List<FoodItem> findAllBySubCategoryId(Long id);

}
