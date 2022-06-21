package projectmanager.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import projectmanager.models.Project;
import projectmanager.services.ProjectService;
import projectmanager.services.UserService;

@Controller
public class ProjectController {
	@Autowired
	ProjectService projectService;
	@Autowired
	UserService userService;
	
	
	
	public ProjectController(ProjectService projectService)
	{
		this.projectService=projectService;
	}
	@GetMapping("/projects/new")
	public String ProjectNewGet(Model model, HttpSession session)
	{
		if(session.getAttribute("user")==null) return "redirect:/";
		model.addAttribute("project", new Project());
		return "project_new";
		
		
	}
	@PostMapping("/projects")
	public String ProjectNewPost
	(
	@Valid @ModelAttribute("project") Project project, BindingResult res, HttpSession session
			)
	{
		if(session.getAttribute("user")==null) return "redirect:/";
		if(res.hasErrors()) return "project_new";
	Long user_id=(Long)session.getAttribute("user_id");	
 	projectService.setOwner();
	projectService.create(project);
	return "redirect:/dashboard";
	}
};

