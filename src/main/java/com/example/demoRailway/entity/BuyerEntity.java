package com.example.demoRailway.entity;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "buyers")
@Entity
public class BuyerEntity {
	@Id()
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "first_name")
	private String firstName;
	@Column(name = "last_name")
	private String lastName;
	@Column(name = "email", nullable = false, unique = true)
	private String email;
	@Column(name = "phone", nullable = false, unique = true)
	private String phone;
	@Column(name = "dob")
	private LocalDateTime dob;
	@Column(name = "country")
	private String country;
	@Column(name = "state")
	private String state;
	@Column(name = "district")
	private String district;
	@Column(name = "pincode")
	private String pincode;
	@Column(name = "address")
	private String address;
}
