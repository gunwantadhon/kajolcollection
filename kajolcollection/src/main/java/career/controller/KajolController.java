package career.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class KajolController {
@RequestMapping("/clickme")
public ModelAndView index()
{
	ModelAndView m1=new ModelAndView("page");
	m1.addObject("this is msg");
	return m1;
}
}
