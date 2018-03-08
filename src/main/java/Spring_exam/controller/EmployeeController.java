package Spring_exam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController 
{
	@RequestMapping("/")
	public ModelAndView home()
	{
		ModelAndView mv=new ModelAndView("NewFile");
		return mv;
	}
	
	

}
