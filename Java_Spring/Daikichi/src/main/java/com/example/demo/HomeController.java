package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController 
{

	@GetMapping("/")
	public String home()
	{
		String content="";
		for(int i=0;i<10;i++)
		{
			content+="<h1>Hello World "+i+"</h1>";
		}
		return content;
	}
	@GetMapping ("/daikichi")
	public String Welcome() {
		return "Welcome";}
	
	@GetMapping("daikichi/today")
	public String Today() {
		return "Today you will find luck in all your endeavors!";
	}
	@GetMapping("daikichi/tomorrow")
	public String Tomorrow() {
		return"Tomorrow, an opportunity will arise, so be sure to be open to new ideas!";
	}
	}
	
	


			
	

	