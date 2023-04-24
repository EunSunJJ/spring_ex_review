package com.exreview.lesson03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.exreview.lesson03.bo.ReviewBO;
import com.exreview.lesson03.model.Review;

@RestController
public class ReviewRestController {

	@Autowired
	private ReviewBO reviewBO;
	
	@RequestMapping("/lesson03/ex01")
	//  http://localhost/lesson03/ex01?id=1
	
	public Review ex01(
			@RequestParam(value = "id") int id ) {
		return reviewBO.getReview(id);
	}	
	
	@RequestMapping("/lesson03/ex02_1")
	//  http://localhost/lesson03/ex02_1
	
	public String ex02_1() {
		Review review = new Review();
		review.setStoreId(7);
		review.setMenu("삼겹혼밥세트");
		review.setUserName("신보람");
		review.setPoint(4.5);
		review.setReview("혼자 먹기 딱 적당하네요");
		
		int row = reviewBO.addReview(review);
		return "susccess row count" + row;
	}

	@RequestMapping("/lesson03/ex02_2")
	//  http://localhost/lesson03/ex02_2
	
	public String ex02_2() {
		int row = reviewBO.addReviewAsFiedld(3, "콤비네이션R", "신바다", 5.0, "역시 맛있다!!!");
		return "success row count : " + row;
	}
	
	@RequestMapping("/lesson03/ex03")
	//  http://localhost/lesson03/ex03?id=23&review=도미노피자는역시맛있어~~
	
	public String ex03(
			@RequestParam("id") int id,
			@RequestParam("review") String review) {
		int row = reviewBO.updateReviewById(id, review);
		return "변경 완료 : " + row;
	}
	
	@RequestMapping("/lesson03/ex04")
	//  http://localhost/lesson03/ex04?id=22
	public String ex04(
			@RequestParam("id") int id) {
		reviewBO.deleteReviewById(id);
		return "삭제 완료";
	}
	
	
	
}
