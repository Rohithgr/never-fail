package com.lti.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.lti.core.entities.AddBus;
import com.lti.core.services.AdminServices;
import com.lti.core.services.BusServices;

@Controller
public class BusController {
	

	@Autowired
	AdminServices adServices;
	
	@Autowired
	BusServices bServices;
	
	
	//http://localhost:8082/try_harder/busDetails.do
	@RequestMapping(value="busDetails.do")
	public ModelAndView viewBusDetails(@RequestParam("busId") int busId)
	{
		ModelAndView mAndV = new ModelAndView();
		AddBus busDetails = adServices.getBusDetails(busId);
		mAndV.addObject("busDetails",busDetails);
		mAndV.setViewName("BookingPage");
		return mAndV;
	}
	
	
	
	
	//http://localhost:8082/try_harder/passengerDetails.do
	@RequestMapping(value="passengerDetails.do", method=RequestMethod.POST)
	public ModelAndView selectedSeat(@RequestParam("busId") int busId, @RequestParam String[] ckb,@RequestParam int total)
	{
		ModelAndView mAndV = new ModelAndView();
		AddBus busDetails = bServices.getBusDetails(busId);
		mAndV.addObject("busDetails",busDetails);
		mAndV.addObject("seats",ckb);
		mAndV.addObject("totalSeats",total);
		System.out.println("POST: Passenger Details ");
		mAndV.setViewName("PassengerDetails");
		return mAndV;
		
	}
	
}
