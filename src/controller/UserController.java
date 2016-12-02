package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import service.UserService;

import entity.User;
import exception.DuplicateUsernameException;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	@ExceptionHandler(DuplicateUsernameException.class)
	public ModelAndView exceptionHandler(DuplicateUsernameException e){
		return new ModelAndView("regist","message",e.getMessage());
	}


	@RequestMapping("/regist")
	public String regist(User user)throws Exception{
		userService.regist(user);
		return "redirect:/showSuccess";
	}
}









