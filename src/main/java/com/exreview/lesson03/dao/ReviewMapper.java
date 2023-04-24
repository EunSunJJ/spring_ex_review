package com.exreview.lesson03.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.exreview.lesson03.model.Review;

@Repository
public interface ReviewMapper {

	public Review selectReview(@Param("id") int id);
	
	public int insertReview(Review review);
	
	public int insertReviewAsFiedld(
			@Param("storeId") int storeId, 
			@Param("menu") String menu, 
			@Param("userName") String userName, 
			@Param("point") double point, 
			@Param("review") String review); 
	
	public int updateReviewById(
			@Param("id") int id, 
			@Param("review") String review);
	
	public void deleteReviewById(int id);
}
