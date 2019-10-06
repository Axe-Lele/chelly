package com.camcoffee.yiu.controller;

import java.text.DateFormat;
import java.util.*;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.camcoffee.yiu.dto.User;
import com.camcoffee.yiu.service.HeaderService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
    /**
     * Simply selects the home view to render by returning its name.
	     */
	    
	    @RequestMapping(value = "/home", method = RequestMethod.GET)
	    public String home(Locale locale, Model model) {
        logger.info("Welcome home! The client locale is {}.", locale);
		
		        Date date = new Date();
		        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		        String formattedDate = dateFormat.format(date);
		
		        model.addAttribute("serverTime", formattedDate );
		
		        return "home";
	    }
	    
	    @RequestMapping(value = "/test", method = RequestMethod.GET)
	    public String test(Locale locale, ModelMap modelMap, User camcoffeeUsers) {

        modelMap.addAttribute("userName", camcoffeeUsers.getUserName());
	    modelMap.addAttribute("userPwd", camcoffeeUsers.getUserPwd());
        modelMap.addAttribute("userPwd2", camcoffeeUsers.getUserPwd2());
        modelMap.addAttribute("birthYear", camcoffeeUsers.getBirthYear());
        modelMap.addAttribute("birthMonth", camcoffeeUsers.getBirthMonth());
	    modelMap.addAttribute("birthDay", camcoffeeUsers.getBirthDay());
	
	        return "test";
	    }
	    
//	    @RequestMapping("/camcoffee/login")
//	    public String getLoginPage(Model model, HttpServletRequest request)
//	    							throws Exception {
//	    	return "index";
//	    
//	    }
	    
	    /** 로그인(index)페이지 
	     * 
	     * @param locale
	     * @param model
	     * @return
	     * @throws Exception
	     */
	    @RequestMapping(value = "/camcoffee/login", method = RequestMethod.GET)
	    public String loginpage(Locale locale, Model model) throws Exception {
	    	
	    	
	    	return "/index";
	    }
	    
	    /** 회원가입페이지 
	     * 
	     * @param locale
	     * @param model
	     * @return
	     * @throws Exception
	     */
	    @RequestMapping("/camcoffee/join")
	    public String joinpage( Model model, HttpServletRequest request) throws Exception {
	    	

	    	return "/join";
	    }
	    
	    /** 메인페이지 
	     * 
	     * @param locale
	     * @param model
	     * @return
	     * @throws Exception
	     */
	    @RequestMapping("/camcoffee/main")
	    public String mainpage( Model model) throws Exception {
	    	
	    	
	    	return "/main";
	    }
	   
	
}
