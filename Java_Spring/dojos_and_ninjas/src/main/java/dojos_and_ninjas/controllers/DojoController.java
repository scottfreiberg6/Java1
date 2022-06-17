package dojos_and_ninjas.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import dojos_and_ninjas.models.Dojo;
import dojos_and_ninjas.services.DojoService;
import dojos_and_ninjas.services.NinjaService;

@Controller
@RequestMapping("/dojo")
public class DojoController {

@Autowired
private DojoService dojoService;
@Autowired
private NinjaService ninjaService;

@GetMapping("/new")
public String createDojo (Model model)
{
	model.addAttribute("newDojo", new Dojo());
	return "dojo";
}
@PostMapping("/new")
public String insertDojo(@Valid @ModelAttribute("newDojo") Dojo dojo, BindingResult res)
{
	if(res.hasErrors()) {
		return"dojo";
	}
	dojoService.create(dojo);
	return"redirect:/dojo/new";
}
}
