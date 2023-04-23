package com.exreview.lesson03.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exreview.lesson03.dao.ReviewMapper;
import com.exreview.lesson03.model.Review;

@Service
public class ReviewBO {

	@Autowired
	private ReviewMapper reviewMapper;
	
	// input : id
	// output : Review
	public Review getReview(int id) {
		return reviewMapper.selectReview(id);
	}
}
