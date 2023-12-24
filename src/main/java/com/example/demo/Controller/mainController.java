package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class mainController {
  
	@RequestMapping("/login")
	public String login()
	{
		return "login.html";
	}
	
	@RequestMapping("/check_password")
	public String checkPass(@RequestParam String username, @RequestParam String password )
	{
		if(password.equals("9080")&& username.equals("tazulislam111110@gmail.com"))
			return "loged_in_page";
		else
		{
			return "wrong_pass";
		}
		
	}
	@RequestMapping("/loged_in_page")
	public String Logedin()
	{
		return "loged_in_page";
	}
	
	@RequestMapping("/returned")
	public String returned()
	{
		return "redirect:/login";
	}
}
