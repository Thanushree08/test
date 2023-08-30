package com.example.demo.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Embeddable
public class Company {
	@Column(name="company_name")
	private String name;
	private String catchPhase;
	private String bs;
	
	public Company( ) {}

}
