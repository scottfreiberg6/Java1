package OmikujiForm;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("")
public class RootController {
	@GetMapping("")
	public String index()
	{
		
		return "index";
	}
	@PostMapping("/submit")
	public String process(
			@RequestParam("number")String number, HttpSession session,
			@RequestParam("city")String city,
			@RequestParam("person")String person,
			@RequestParam("hobby")String hobby,
			@RequestParam("living_thing")String living_thing,
			@RequestParam("nice")String nice
			
)
	
	{
		session.setAttribute("number",number);
		session.setAttribute("city",city);
		session.setAttribute("person", person);
		session.setAttribute("hobby",hobby);
		session.setAttribute("living_thing",living_thing);
		session.setAttribute("nice", nice);
	return "redirect:/show";
}
	@GetMapping("/show")
	public String showPage(HttpSession session, Model model) {
		model.addAttribute("number", session.getAttribute("number"));
		model.addAttribute("city", session.getAttribute("city"));
		model.addAttribute("person",session.getAttribute("person"));
		model.addAttribute("hobby", session.getAttribute("hobby"));
		model.addAttribute("living_thing",session.getAttribute("living_thing"));
		model.addAttribute("nice",session.getAttribute("nice"));
		return "showPages";
		
	}
};
