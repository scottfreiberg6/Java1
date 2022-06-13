package fruity_loops;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/")
public class RootController {
	

	
		/* flash attribute redirect fix: */
		/* org.springframework.validation.BindingResult.model_name */

		@GetMapping("")
		public String index(Model model)
		
		{
			ArrayList<Item> items=new ArrayList<Item>();
			items.add (new Item("Watermelon",3.99));
			items.add (new Item("bannas",2.80));
			items.add (new Item("apples",1.10));
			items.add (new Item("broccolo",3.99));
			items.add (new Item("carrot",1.50));
			model.addAttribute("cart",items);
			return "index";
		}
		
			
	};

