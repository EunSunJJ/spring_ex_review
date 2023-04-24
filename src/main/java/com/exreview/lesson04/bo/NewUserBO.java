package com.exreview.lesson04.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exreview.lesson04.dao.NewUserMapper;

@Service
public class NewUserBO {

	@Autowired
	private NewUserMapper newUserMapper;
	
	public void addNewUser(String name, String yyyymmdd, String email, String introduce) {
		newUserMapper.selectNewUser(name, yyyymmdd, email, introduce);
	}
}
