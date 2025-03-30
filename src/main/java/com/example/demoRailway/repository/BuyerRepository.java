package com.example.demoRailway.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demoRailway.entity.BuyerEntity;
public interface BuyerRepository extends JpaRepository<BuyerEntity, Integer> {

}
