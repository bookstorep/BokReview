package com.mario.gtest.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import com.mario.gtest.entity.Reviews;

public interface BookReviewCustomRepository {
	
	
	 
	public List<Reviews> getReviewByTitle(String title) throws Exception;
	public List<Reviews> getReviewByPoints(long points) throws Exception;
	public List<Reviews> getReviewByISBNumber(int ISbNUmber) throws Exception;
	@Query("from Reviews where reviewId >= :range1 and reviewId <= :range2")
	public List<Reviews> getReviewBetweenIds(@Param("range1") int range1,@Param("range2") int range2)throws Exception;
	

}



