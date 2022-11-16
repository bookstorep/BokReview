package com.mario.gtest.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "reviews")
public class Reviews {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int reviewId;
	
	private int ISBNumber;
	private String title;
	private String description;
	private int points;
	private String  date;
	public Reviews(int iSBNumber, String title, String description, int points, String date) {
		super();
		ISBNumber = iSBNumber;
		this.title = title;
		this.description = description;
		this.points = points;
		this.date = date;
	}
	
	}
	
	


