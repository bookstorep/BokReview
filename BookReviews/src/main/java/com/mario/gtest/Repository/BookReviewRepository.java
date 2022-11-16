package com.mario.gtest.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mario.gtest.entity.Reviews;


@Repository
public interface BookReviewRepository extends JpaRepository<Reviews, Integer> , BookReviewCustomRepository
{
	 // no code at all
	}


