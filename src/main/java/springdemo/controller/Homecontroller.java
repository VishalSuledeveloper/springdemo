package springdemo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Homecontroller {

	@RequestMapping("/home")
	//return type ModelAndView
	
	public ModelAndView xyz() {
		ModelAndView m=new ModelAndView();
		
		m.addObject("username","Alandi");
		
		m.setViewName("index");
		return m;
	}
	
	@RequestMapping("/resisteration")
	public String signin(@RequestParam ("username" ) String uname,
			@RequestParam ("password") String pwd,Model mo)
	{
		mo.addAttribute("username",uname);
		
		if(uname.equals("vishal")&& pwd.equals("12345"))
		{
		return "success";	
		}
		else
		{
			String errormsg="Something Went Wrong...";
			mo.addAttribute("msg",errormsg);
			return"register";
		}
	}
	
}
	