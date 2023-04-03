package crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import crud.bean.LoginBean;
import crud.model.Loginn;
import crud.model.Product;
import crud.service.LoginService;

@Controller
public class LoginController {

	@Autowired
	private LoginService loginService;

	@RequestMapping("/")
	public String showForm(Model m) {
		System.out.println("Login page====================================================");
		return "Login";
	}
	

	@RequestMapping(value = "/Login", method = RequestMethod.POST)
	public String addData(Model m, LoginBean loginBean) {

		System.out.println("hhmmmmmmmmmmmmmmm"+loginBean.getName()+"   "+loginBean.getPassword());
		System.out.println("welcome to mumbai....................");
		boolean i = loginService.getLogin(loginBean);
		if(i) {
			return "addProduct";	
		}else {
			
			return "Login";
		}
		}
	  
	@RequestMapping("/registration")
     public String registrationForm()
     {
			 
    	 return "Registration";
    	 
     }
		
		 @RequestMapping( value ="/Registration",method = RequestMethod.POST)
		 public String registration(Model m, Loginn loginn) {
			 System.out.println("Data is comeming from client "+loginn);
			 int i=loginService.registration(loginn);
			 System.out.println("welcome to registration page..");
			 
			 return "Login";
		 
		  }
		 
	

}
