package com.exreview.lesson01;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/lesson01/ex01")
@Controller
public class Lesson01Controller {

	@ResponseBody
	@RequestMapping("/1")
	//  http://localhost:8080/lesson01/ex01/1
	public String printString() {
		String text = "예제1번<br>문자열을 response body로 보내는 예제";
		return text;
	}
	
	@RequestMapping("/2")
	public @ResponseBody Map<String, Object> printMap() {
		//  http://localhost:8080/lesson01/ex01/2
		Map<String, Object> map = new HashMap<>();
		map.put("a", "apple");
		map.put("b", "banana");
		map.put("c", "cat");
		map.put("d", "dark");
		return map;
	}
}
