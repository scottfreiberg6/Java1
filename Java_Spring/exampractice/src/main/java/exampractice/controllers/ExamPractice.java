package exampractice.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import exampractice.models.Exam;
import exampractice.models.User;
import exampractice.services.ExamService;
import exampractice.services.UserService;


@Controller
@RequestMapping("/books")
public class ExamPractice {
@Autowired
private ExamService examService;
@Autowired
private UserService userService;
@GetMapping("/book")
public String createBook (Model model, HttpSession session)

{
	User user=(User) session.getAttribute("user");
	if(user==null) return "redirect:/";
	model.addAttribute("postedBy", user);
	model.addAttribute("exam", new Exam());
	return "add";
}
@PostMapping("/create")
public String insertBook(@Valid @ModelAttribute("exam")Exam exam, BindingResult res, HttpSession session)
{
	if(session.getAttribute("user")==null) return "redirect:/";
if(res.hasErrors()) {
	return "add";
}
examService.create(exam);
return"redirect:/dashboard";
}
@GetMapping("/show/{id}")
public String show( @PathVariable("id") Long examId, Model model, HttpSession session )
{
	if(session.getAttribute("user")==null) return "redirect:/";
	model.addAttribute("exam",examService.findById(examId));
	return "show";
}
@GetMapping("/edit/{id}")
public String edit(@PathVariable("id")Long examId, Model model, HttpSession session)
{
	User user=(User) session.getAttribute("user");
	if(user==null) return "redirect:/";
	Exam exam=examService.findById(examId);
	if(user.getId()!=exam.getUser().getId()) return "redirect:/dashboard";
	model.addAttribute("exam",exam);
	return "edit";
}
@PostMapping("/edit/{id}")
public String update(@Valid @ModelAttribute("exam")Exam exam, BindingResult res, HttpSession session)
{
	if(session.getAttribute("user")==null) return "redirect:/";
	if(res.hasErrors())
	{
	return "edit";
	}
examService.update(exam);
return"redirect:/dashboard";
}
@PostMapping("/delete/{id}")
public String deleteExam(@PathVariable("id")Long examId, Model model, HttpSession session)
{
	if(session.getAttribute("user")==null) return "redirect:/";
	examService.deleteById(examId);
	return "redirect:/dashboard";
}
}
