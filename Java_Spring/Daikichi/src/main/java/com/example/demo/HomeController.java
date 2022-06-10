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
	@GetMapping("/daikichi/{id}")
	public String daikichi(@PathVariable("id") int id)
	{
		if(id%2==0)
		{
			return "You will take a grand journey in the near future, but be weary of tempting offers";
		}
		else
		{
			return "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends.";
		}
	}
	@GetMapping ("daikichi/travel/{city}")
	public String findCity
	(@PathVariable String city) {
	return "<h1>Congratulations! You will soon travel to "+city+"</h1>";
	}
}
	


			
	

	