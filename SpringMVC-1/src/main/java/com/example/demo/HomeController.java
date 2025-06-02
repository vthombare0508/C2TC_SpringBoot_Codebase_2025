package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController 

{
 @RequestMapping("admin")
  public String print()
  {
	  System.out.println("Hey Everyone,tomorrow is holiday");
	  return "home.jsp";
	  
  }
	
}
