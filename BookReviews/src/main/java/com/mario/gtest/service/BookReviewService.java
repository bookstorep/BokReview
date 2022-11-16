package com.mario.gtest.service;

import java.util.List;

import org.springframework.stereotype.Service;


import com.mario.gtest.entity.Reviews;

@Service
public interface BookReviewService {
	
	public List<Reviews> getAllReviews()throws Exception;
	public Reviews insertReview(Reviews review)throws Exception;
     public Reviews updateReview(Reviews review)throws Exception;
     public void deleteByReviewId(int reviewId)  throws Exception;
 	
	public List<Reviews> getReviewByTitle(String title) throws Exception;
	public List<Reviews> getReviewByPoints(int points) throws Exception;
	public List<Reviews> getReviewBetweenIds(int range1,int range2)throws Exception;
	public Reviews getReviewById(int searchedReviewId) throws Exception;;
	public List<Reviews> getReviewByISBNumber(int ISBNUmber) throws Exception;
	
	public List<Reviews>  sortByPoints()  throws Exception;
}
