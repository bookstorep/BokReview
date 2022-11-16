package com.mario.gtest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mario.gtest.entity.Reviews;
import com.mario.gtest.service.BookReviewService;

@RestController
@RequestMapping("/reviews")
public class BookReviewRestController {
	
	@Autowired
	BookReviewService service;
	//localhost:8001/reviews/sort/points
	@GetMapping("/sort/points")
	public List<Reviews> sortingByPoints() throws Exception
	{
		return  service.sortByPoints();
	}
	
}
