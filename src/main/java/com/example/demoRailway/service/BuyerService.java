package com.example.demoRailway.service;

import com.example.demoRailway.dto.BuyerDto;
import com.example.demoRailway.entity.BuyerEntity;

public interface BuyerService {
    BuyerDto saveBuyer(BuyerDto buyer);
}
