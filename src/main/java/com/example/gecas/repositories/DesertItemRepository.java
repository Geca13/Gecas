package com.example.gecas.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.gecas.entities.DesertItem;

@Repository
public interface DesertItemRepository extends JpaRepository<DesertItem, Long> {

	List<DesertItem> findAllBySubId(Long id);

}
