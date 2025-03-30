package com.example.demoRailway.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demoRailway.dto.BuyerDto;
import com.example.demoRailway.service.BuyerService;

@RestController
@RequestMapping("/buyer")
public class BuyerController {
	private BuyerService buyerService;
	public BuyerController(BuyerService buyerService) {
        this.buyerService = buyerService;
    }
	@PostMapping("/registration")
	public BuyerDto saveBuyer(@RequestBody BuyerDto buyer) {
		return buyerService.saveBuyer(buyer);
	}
}
