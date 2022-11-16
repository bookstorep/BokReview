package com.mario.gtest.util;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.mario.gtest.dto.UserDefaultResponseDTO;
import com.mario.gtest.dto.UserReviewCreatedResponseDTO;
import com.mario.gtest.entity.Reviews;

@Component
@Scope("singleton")
public class UserDTOConvertor {
	public static UserDefaultResponseDTO  getUserDefaultDTO(Reviews review)
	{
		UserDefaultResponseDTO dto = new UserDefaultResponseDTO(
				review.getISBNumber(),
				review.getTitle(),
				review.getDescription(),
				review.getPoints(),
				review.getDate());
				                
		return dto;
	}
}
	
	
	

