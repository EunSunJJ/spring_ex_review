package com.exreview.lesson01;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/lesson01/ex01")
@RestController
public class Lesson01RestController {

	@RequestMapping("/3")
//  http://localhost:8080/lesson01/ex01/3
	public String printString() {
		return "@RestController를 사용해 String을 리턴해본다.";
	}
	
	@RequestMapping("/4")
//  http://localhost:8080/lesson01/ex01/4
	public Map<String, Object> printMap() {
		Map<String, Object> map = new HashMap<>();
		map.put("aaa", "111");
		map.put("bbb", "222");
		map.put("ccc", "333");
		return map;
	}
	
	//  http://localhost:8080/lesson01/ex01/5
	@RequestMapping("/5")
	public Data printData() {
		Data data = new Data(); // 일반 자바 bean
		data.setId(1);
		data.setName("신보람");
		return data;
	}
	
	@RequestMapping("/6")
//  http://localhost:8080/lesson01/ex01/6
	public ResponseEntity<Data> entity() {
		Data data = new Data(); 
		data.setId(1);
		data.setName("신보람");
		return new ResponseEntity<>(data, HttpStatus.INTERNAL_SERVER_ERROR); // 500 error
	}
}
