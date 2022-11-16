package com.mario.gtest.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class UserDefaultResponseDTO implements MyDTO{
	
	private int ISBNumber;
	private String title;
	private String description;
	private int points;
	private String  date;

}
