package test;

import javax.faces.application.Application;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import service.UserService;

import entity.User;
import exception.DuplicateUsernameException;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext*.xml");
		
//		User user=new User();
//		user.setUsername("aaa");
//		user.setPassword("111");
//		user.setPhone("11111111");
		
		UserService userService=(UserService) ac.getBean("userServiceImpl");
		
		
//		try {
//			userService.regist(user);
//			System.out.println("注册成功");
//		} catch (DuplicateUsernameException e) {
//			System.out.println(e.getMessage());
//		}
		
		User user=userService.findById(1);
		
		System.out.println(user.getId()+" "+user.getUsername()+" "+user.getPassword());
	}
}
