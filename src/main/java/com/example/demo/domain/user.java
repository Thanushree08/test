package com.example.demo.domain;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity
public class user {
	
	
	
	
    @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    
    private Long id;
    private String name;
    private String username;
    private String email;
    private String password;
    private String website;
    
    @Embedded
    private Address address;
    
    @Embedded
    private Company company;
    
    public user() {}
    
	
	

}
