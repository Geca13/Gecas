package com.example.gecas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.gecas.entities.DrinkItem;

@Repository
public interface DrinkItemRepository extends JpaRepository<DrinkItem, Long> {

}
