package com.exreview.lesson04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.exreview.lesson04.bo.NewUserBO;
import com.exreview.lesson04.model.NewUser;

@RequestMapping("/lesson04/ex01")
@Controller
public class NewUserController {
	
	@Autowired
	private NewUserBO newUserBO;
	
	@GetMapping("/add_user_view")
	//  http://localhost/lesson04/ex01/add_user_view
	public String addUserView() {
		return "lesson04/addUser";
	}
	
	@PostMapping("/add_user")
	public String addUser(
			@RequestParam("name") String name, 
			@RequestParam("yyyymmdd") String yyyymmdd,
			@RequestParam(value="email", required=false) String email, 
			@RequestParam(value="introduce", required=false) String introduce) {
		
		// DB insert
		newUserBO.addNewUser(name, yyyymmdd, email, introduce);
		
		return "lesson04/afterAddUser";
	}
	
	@GetMapping("/get_last_user_view")
	//  http://localhost/lesson04/ex01/get_last_user_view
	public String getUserView(Model model) {
		
		// DB select - 가장 최근에 추가된 사람 한명 가져오기
		NewUser newUser = newUserBO.getLastUser();
		model.addAttribute("result", newUser);
		model.addAttribute("subject", "회원정보");
		return "lesson04/getLastUser";
	}
	
}
