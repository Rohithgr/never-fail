package com.lti.web.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
//import java.util.Date;
import org.springframework.web.servlet.ModelAndView;

import com.lti.core.entities.AddBus;
import com.lti.core.entities.Admin;
import com.lti.core.services.AdminServices;

@Controller
public class AdminController {
	@Autowired
	private AdminServices adService;
	
	
	@RequestMapping(path="/adminLogin.do")
	public String adminLoginPage(){
		return "AdminLogin";
	}
	
	//Insertion Pages----------------------------------------------------------------------------
	
	//http://localhost:8082/try_harder/adminSignup.do
	@RequestMapping(path="adminSignup.do", method=RequestMethod.GET)
	public String adminSignupPage(){
		return "AdminSignup";
	}
	@RequestMapping(path="adminSignup.do", method=RequestMethod.POST)
	public String addNewAdmin(@RequestParam("adminId") int adminId,@RequestParam("phoneNum") long phoneNum, @RequestParam("password") String password,@RequestParam("email") String email,@RequestParam("firstName") String firstName,@RequestParam("lastName") String lastName,@RequestParam("firmName") String firmName){
		System.out.println("Password: "+password);
		Admin ad = new Admin();
		ad.setAdminId(adminId);
		ad.setPhoneNum(phoneNum);
		ad.setPass(password);
		ad.setEmail(email);
		ad.setFirstName(firstName);
		ad.setLastName(lastName);
		ad.setFirmName(firmName);
	
		boolean result = adService.joinNewAdmin(ad);
		if(result){
			return "redirect:adminDashboard.do";
		}
		return "Error";
	}
	
	//http://localhost:8082/try_harder/addBus.do
		@RequestMapping(path="addBus.do", method=RequestMethod.GET)
		public String addBus(){
			return "AddBus";
		}
		@RequestMapping(path="addBus.do", method=RequestMethod.POST)
		public String addBus(@RequestParam("busId") int busId,@RequestParam("busName") String busName, @RequestParam("vehNum") String vehNum,@RequestParam("source") String source,@RequestParam("destination") String destination){	
			AddBus addB = new AddBus();
			addB.setBusId(busId);
			addB.setBusName(busName);
			addB.setVehNum(vehNum);
			addB.setSource(source);
			addB.setDestination(destination);
			java.util.Date date = new java.util.Date();
			addB.setDate(date);
			
			boolean result = adService.joinNewBus(addB);
			if(result){
				return "redirect:showBus.do";
			}
			return "Error";
		}
	
	//end of insertion pages --------------------------------------------------------------------------------
	
	//http://localhost:8082/try_harder/adminDashboard.do
	@RequestMapping(path="adminDashboard.do", method=RequestMethod.GET)
	public String adminDashboard(){
		return "AdminDashboard";
	}
	
	//bus details show-----------------------------------------------------------------
	//http://localhost:8082/try_harder/showBus.do
	@RequestMapping(path="showBus.do", method=RequestMethod.GET)
	public String showbus(Model model){
		List<AddBus> list = adService.findAllBus();
		model.addAttribute("busList", list);
		return "ShowBus";
	}
	//bus details show end----------------------------------------------------------
	
	//validate admin login-------------------------------------------------------
	//http://localhost:8082/try_harder/adminLogin.do
		@RequestMapping(path="adminLogin.do", method=RequestMethod.GET)
		public String ValidateLogin(){
			return "AdminLogin";
		}
		
		@RequestMapping(path="adminLogin.do", method=RequestMethod.POST)
		public String login(@RequestParam("phoneNum") long phoneNum ,@RequestParam("password")String password,HttpSession session,HttpServletRequest request)
		{
			Admin ad = adService.loginAdmin(phoneNum);
			
			if(ad.getPass().contentEquals(password)) {
				return "AdminDashboard";
			}
			else {
				return "AdminLogin";
			}
			//validate admin login end----------------------------------------------------
		}
		// fetched bus-------------------------------------------
		
		@RequestMapping(value ="customerDashboard.do", method=RequestMethod.GET)
		public String userViewDashboard( Model model){
			
			return "CustomerDashboard";
		}

		
		@RequestMapping(value ="busList.do", method=RequestMethod.GET)
		public String userViewBusList(@RequestParam("source") String source, @RequestParam("destination") String destination, Model model){
		AddBus addB = new AddBus();
			addB.setSource(source);
			addB.setDestination(destination);
			List<AddBus> list = adService.userFindBus(source, destination);
			model.addAttribute("busList", list);	
			
			return "BusList";
		}
		
		
	
}
