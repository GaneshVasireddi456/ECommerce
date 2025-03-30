package com.example.demoRailway.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demoRailway.dto.BuyerDto;
import com.example.demoRailway.entity.BuyerEntity;
import com.example.demoRailway.mapper.BuyerMapper;
import com.example.demoRailway.repository.BuyerRepository;
import com.example.demoRailway.service.BuyerService;
@Service
public class BuyerServiceImpl implements BuyerService {
	@Autowired
private BuyerRepository buyerRepo;
	@Override
	public BuyerDto saveBuyer(BuyerDto buyer) {
		BuyerEntity buyerNew = BuyerMapper.mapToBuyerEntity(buyer);
		BuyerEntity savedStudent = buyerRepo.save(buyerNew);
		return BuyerMapper.mapToBuyerDto(savedStudent);
	}
}
