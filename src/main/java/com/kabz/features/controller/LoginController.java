package com.kabz.features.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.kabz.features.model.User;

@Controller
@RequestMapping(value = "/login")

public class LoginController {
	
	@RequestMapping(method = RequestMethod.GET)
	public String viewLogin(Map<String, Object> model) {
				
		List<String> professionList = new ArrayList<>();
		professionList.add("Driver");
		professionList.add("Customer");
		professionList.add("vendor");
		model.put("professionList", professionList);
		
		return "login";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String processRegistration( 
			Map<String, Object> model) {
		
		// implement your own registration logic here...
		
		// for testing purpose:
		/*System.out.println("username: " + user.getUsername());
		System.out.println("password: " + user.getPassword());
		System.out.println("email: " + user.getEmail());
		System.out.println("birth date: " + user.getBirthDate());
		System.out.println("profession: " + user.getProfession());*/
		
		return "loginSuccess";
	}

}
