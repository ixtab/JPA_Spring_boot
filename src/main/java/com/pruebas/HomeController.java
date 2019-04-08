package com.pruebas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pruebas.UserRepository;

@Controller
public class HomeController {
	
		@Value("${app.controllers.title}")
		private String title;
	    @Autowired UserRepository userRepo;
	  
	    @RequestMapping("/")
	    public String home(Model model)
	    {
	        model.addAttribute("users", userRepo.findAll());
	        model.addAttribute("title", title);
	        return "index";
	    }
}
