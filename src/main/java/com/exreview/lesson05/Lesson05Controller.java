package com.exreview.lesson05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/lesson05")
@Controller
public class Lesson05Controller {

	@RequestMapping("/ex01")
	// http://localhost/lesson05/ex01
	public String ex01() {
		return "lesson05/ex01";
	}
	
	@RequestMapping("/ex02")
	// http://localhost/lesson05/ex02
	
	// List
	public String ex02(Model model) {
		List<String> fruits = new ArrayList<>();
		fruits.add("apple");
		fruits.add("melon");
		fruits.add("peach");
		fruits.add("grape");
		fruits.add("mango");
		model.addAttribute("fruits", fruits);

	// List<Map>
	List<Map<String, Object>> users = new ArrayList<>();
	Map<String, Object> map = new HashMap<>();
	map.put("name", "신보람");
	map.put("age", 25);
	map.put("hobby", "노래하기");
	users.add(map);
	model.addAttribute("users", users);
	
	map = new HashMap<>();
	map.put("name", "신바다");
	map.put("age", 30);
	map.put("hobby", "사냥하기");
	users.add(map);
	model.addAttribute("users", users);
	
	return "lesson05/ex02";
	}
}
