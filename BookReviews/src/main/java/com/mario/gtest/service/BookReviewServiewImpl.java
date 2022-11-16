package com.mario.gtest.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.mario.gtest.Repository.BookReviewRepository;
import com.mario.gtest.comparator.SortReviewByPointHighToLow;
import com.mario.gtest.entity.Reviews;

@Service
public  class BookReviewServiewImpl implements BookReviewService {
	
	@Autowired
	BookReviewRepository userRepository;

	@Override
	public Reviews insertReview(Reviews review) throws Exception {
		Reviews savedReview =  userRepository.save(review);  // Note :  save() is already implemented by Spring Data JPA
		if(savedReview != null)
		{
			return savedReview;
		}
		else return null;
	}
	


	@Override
	public List<Reviews> getAllReviews() throws Exception {
		List<Reviews> allReview = userRepository.findAll();
		return allReview;
	}
	

		@Override
	public void deleteByReviewId(int reviewId) throws Exception {
		// TODO Auto-generated method stub
		 userRepository.deleteById(reviewId);
	}



	@Override
	public Reviews updateReview(Reviews review) throws Exception {
		
		Reviews savedReview=userRepository.save(review);
		return savedReview;
	}



	@Override
	public List<Reviews> getReviewByTitle(String title) throws Exception {
		List<Reviews> outputReview=getAllReviews().stream().filter((rev)->rev.getTitle().equals(title)).collect(Collectors.toList());
		return outputReview;
	}



	@Override
	public List<Reviews> getReviewByPoints(int points) throws Exception {
		List<Reviews> savedReview=userRepository.getReviewByPoints(points);
		return savedReview;
	}

	@Override
	public List<Reviews> getReviewBetweenIds(int range1, int range2) throws Exception {
		return userRepository.getReviewBetweenIds(range1, range2);

	}



	@Override
	public Reviews getReviewById(int searchedReviewId) {
		Reviews savedReview = userRepository.getReferenceById(searchedReviewId);
		System.out.println("-->> inside Service Impl "+savedReview);
		return savedReview;
	}



	

	@Override
	public List<Reviews> getReviewByISBNumber(int ISBNUmber) throws Exception {
		List<Reviews> savedReview=userRepository.getReviewByISBNumber(ISBNUmber);
		return savedReview;
	}


	@Override
	public List<Reviews> sortByPoints() throws Exception {
		List<Reviews> list =userRepository.findAll();
		List<Reviews> review=new ArrayList<>();
		Collections.sort(list,new SortReviewByPointHighToLow());
		return list;
	}	
}
	



	

	
	

	

	
	


	
	


	


	


	
	


	



