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
}
