package dojos_and_ninjas.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class RootController {
	@GetMapping
	public String dojo()
	{
		return "dojo";
	}
};
