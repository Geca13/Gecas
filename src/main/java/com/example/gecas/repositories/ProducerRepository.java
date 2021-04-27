package com.example.gecas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.gecas.entities.Producer;

@Repository
public interface ProducerRepository extends JpaRepository<Producer, Long> {

}
