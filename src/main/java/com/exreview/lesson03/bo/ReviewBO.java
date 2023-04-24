package com.exreview.lesson03.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exreview.lesson03.dao.ReviewMapper;
import com.exreview.lesson03.model.Review;

@Service
public class ReviewBO {

	@Autowired
	private ReviewMapper reviewMapper;

	public Review getReview(int id) {
		return reviewMapper.selectReview(id);
	}
	
	public int addReview(Review review) {
		return reviewMapper.insertReview(review);
	}
	
	public int addReviewAsFiedld(int storeId, String menu, String userName, double point, String review) {
		return reviewMapper.insertReviewAsFiedld(storeId, menu, userName, point, review);
	}
	
	public int updateReviewById(int id, String review) {
		return reviewMapper.updateReviewById(id, review);
	}
	
	public void deleteReviewById(int id) {
		reviewMapper.deleteReviewById(id);
	}
}
