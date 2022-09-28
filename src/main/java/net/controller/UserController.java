package net.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import net.bean.User;
import net.service.UserService;

@Controller
@RestController
public class UserController {
	
	@Autowired
	UserService userService;
	
	@RequestMapping(value = "/findAllUser",method = RequestMethod.GET)
	public ModelAndView displayAllUser() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/displayUser.jsp");
		List<User> listOfUser = userService.findAllUsers();
		mav.addObject("listOfUser", listOfUser);
		return mav;
	}
	
	@RequestMapping(value = "/storeUser",method = RequestMethod.POST)
	public ModelAndView storeUser(HttpServletRequest req, User user) {
		int id = Integer.parseInt(req.getParameter("id"));
		String firstName = req.getParameter("firstName");
		String lastName = req.getParameter("lastName");
		int contactNumber = Integer.parseInt(req.getParameter("contactNumber"));
		
		user.setId(id);
		user.setFirstName(firstName);
		user.setLastName(lastName);
		user.setContactNumber(contactNumber);
		
		String result = userService.storeUser(user);
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("storeUser.jsp");
		mav.addObject("msg", result);
		return mav;
	}
	
	@RequestMapping(value = "/updateUser",method = RequestMethod.POST)
	public ModelAndView updateUser(HttpServletRequest req, User user) {
		int id = Integer.parseInt(req.getParameter("id"));
		int contactNumber = Integer.parseInt(req.getParameter("contactNumber"));
		
		user.setId(id);
		user.setContactNumber(contactNumber);
		
		String result = userService.updateUser(user);
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("updateUser.jsp");
		mav.addObject("msg", result);
		return mav;
	}
	
	@RequestMapping(value = "/deleteUser",method = RequestMethod.GET)
	public ModelAndView deleteUser(HttpServletRequest req) {
		int id = Integer.parseInt(req.getParameter("id"));
		
		String result = userService.deleteUser(id);
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("deleteUser.jsp");
		mav.addObject("msg", result);
		return mav;
	}
}
