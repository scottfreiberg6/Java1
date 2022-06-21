package bookclub.controllers;

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

import bookclub.models.Book;
import bookclub.models.User;
import bookclub.services.BookService;
import bookclub.services.UserService;


@Controller

@RequestMapping("/books")
public class BookController {
	@Autowired 
	private BookService bookService;
	@Autowired
	private UserService userService;
	
	@GetMapping("/book")
	public String String (Model model,HttpSession session)
	{
		User user=(User) session.getAttribute("user");
		if(user==null) return "redirect:/";
		model.addAttribute("postedBy", user);
		model.addAttribute("book",new Book());
		return "add";
	};
@PostMapping("/create")
public String createBook(@Valid @ModelAttribute("book")Book book,BindingResult res)
{
	if(res.hasErrors())
	{
		return "add";
	}
	bookService.Create(book);
	return"redirect:/dashboard";
}
@GetMapping("/show/{id}")
public String show( @PathVariable("id") Long bookId, Model model,HttpSession session )
{
	if(session.getAttribute("user")==null) return "redirect:/";
	model.addAttribute("book",bookService.findOne(bookId));
	return "show";
}
@GetMapping("/edit/{id}")
public String edit(@PathVariable("id")Long bookId, Model model,HttpSession session)
{
	if(session.getAttribute("user")==null) return "redirect:/";
	model.addAttribute("book", bookService.findOne(bookId));
	return "edit";
}
@PostMapping("/edit/{id}")
public String update(@Valid @ModelAttribute("book")Book book, BindingResult res,HttpSession session)
{
	if(session.getAttribute("user")==null) return "redirect:/";
	if(res.hasErrors())
	{
	return "edit";
	}
	bookService.update(book);
	return"redirect:/dashboard";

};
@PostMapping("/delete/{id}")
public String deleteBook(@PathVariable("id")Long bookId, Model model,HttpSession session)
{
	if(session.getAttribute("user")==null) return "redirect:/";
	bookService.deleteOne(bookId);
	return "redirect:/dashboard";

}
};
