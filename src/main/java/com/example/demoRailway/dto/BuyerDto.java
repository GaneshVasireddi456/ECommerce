package com.example.demoRailway.dto;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BuyerDto {
	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private String phone;
	private LocalDateTime dob;
	private String country;
	private String state;
	private String district;
	private String pincode;
	private String address;	
}
