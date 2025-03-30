package com.example.demoRailway.mapper;

import com.example.demoRailway.dto.BuyerDto;
import com.example.demoRailway.entity.BuyerEntity;

public class BuyerMapper {
	public static BuyerDto mapToBuyerDto(BuyerEntity buyer) {
        return new BuyerDto(
        		buyer.getId(),
        		buyer.getFirstName(),
        		buyer.getLastName(),
        		buyer.getEmail(),
        		buyer.getPhone(),
        		buyer.getDob(),
        		buyer.getCountry(),
        		buyer.getState(),
        		buyer.getCountry(),
        		buyer.getPincode(),
        		buyer.getAddress()
        );
    }
    public static BuyerEntity mapToBuyerEntity(BuyerDto buyer) {
        return new BuyerEntity(
        		buyer.getId(),
        		buyer.getFirstName(),
        		buyer.getLastName(),
        		buyer.getEmail(),
        		buyer.getPhone(),
        		buyer.getDob(),
        		buyer.getCountry(),
        		buyer.getState(),
        		buyer.getCountry(),
        		buyer.getPincode(),
        		buyer.getAddress()
        );
    }
}
