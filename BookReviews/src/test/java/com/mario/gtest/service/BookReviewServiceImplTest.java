package com.mario.gtest.service;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.BDDMockito;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.mario.gtest.Repository.BookReviewRepository;
import com.mario.gtest.entity.Reviews;

@SpringBootTest
class BookReviewServiceImplTest {
	@Mock
	BookReviewRepository reviewRepository;
	
	@InjectMocks
	BookReviewServiewImpl reviewService;
	
	
	
	@Test
	@DisplayName("Test - to verify the insert operation")
	//@Disabled
	void testInsertReview() throws Exception {
		// given
		Reviews sampleInput = new Reviews(1,2,"a","a",3,"2/3/2022");
		Reviews expectedOutput = new Reviews(1,2,"a","a",3,"2/3/2022");
		//Object obj = new Object();
		BDDMockito.given(reviewService.insertReview(sampleInput)).willReturn(expectedOutput);
		
		// when 
		Reviews actualOutput = reviewService.insertReview(sampleInput);
		
		// verify 
		assertEquals(expectedOutput, actualOutput);
	}
	
	@Test
	@DisplayName("Test to verify all user returend")
	//@Disabled
	void testGetAllReview() throws Exception {
	
		// given
		
		Reviews user1 = new Reviews(1,2,"a","a",3,"2/3/2022");
		
		
		Reviews user2 = new Reviews(1,2,"a","a",3,"2/3/2022");
		
		List<Reviews> sampleOutput = new ArrayList<>();
		sampleOutput.add(user1);
		sampleOutput.add(user2);
		
		BDDMockito.given(reviewService.getAllReviews()).willReturn(sampleOutput);
		
		// ----------------------------------------------------------------------
		
		// when :- readyto test the funcationality (service)
		List<Reviews> actualOutput = reviewService.getAllReviews();
		
		
		// then : verify the sampleOutput with actual output
		// assertThat(actualOutput).isNotNull();  // or
		assertNotNull(actualOutput);
		assertThat(actualOutput.size()).isGreaterThan(0);
		assertIterableEquals(sampleOutput, actualOutput);
		
	}
	@Test
	//@Disabled
	@DisplayName(" Test to check users between Id")
	void testGetReviewsBetweenIds() throws Exception {
		
		// give 
		
           Reviews user1 = new Reviews(1,2,"a","a",3,"2/3/2022");
		    Reviews user2 = new Reviews(1,2,"a","a",3,"2/3/2022");
		
		List<Reviews> sampleOutput = new ArrayList<>();
		sampleOutput.add(user1);
		sampleOutput.add(user2);
		
		int sampleInput1 = 1;
		int sampleInput2 = 20;
		
		
		BDDMockito.given(reviewService.getReviewBetweenIds(sampleInput1, sampleInput2))
		          .willReturn(sampleOutput);
		
		
		// when 
		
		List<Reviews> actualOutput = reviewService.getReviewBetweenIds(sampleInput1, sampleInput2);
		
		
		// verify 
		assertEquals(sampleOutput, actualOutput);
		assertIterableEquals(sampleOutput, actualOutput);
		assertNotNull(actualOutput);
	
	}
}
