package ederminio.com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import ederminio.com.process.ProcessInformation;

@org.springframework.stereotype.Controller
public class Controller {
	
	@RequestMapping("/add")
	public ModelAndView getModelAndView(@RequestParam("t1") long n1 ,@RequestParam("t2") long n2, HttpServletRequest req, HttpServletResponse resp) {		
		ModelAndView mv=new ModelAndView();
		ProcessInformation p=new ProcessInformation();
		mv.setViewName("viewDisplay");
		mv.addObject("resul",p.add(n1, n2));	
		return mv;
	}

}
