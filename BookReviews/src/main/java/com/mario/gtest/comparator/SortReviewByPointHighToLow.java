package com.mario.gtest.comparator;

import java.util.Comparator;

import com.mario.gtest.entity.Reviews;

public class SortReviewByPointHighToLow implements Comparator<Reviews>{

	@Override
	public int compare(Reviews o1, Reviews o2) {
		// TODO Auto-generated method stub
		return o2.getPoints()-o1.getPoints();
	}

}
