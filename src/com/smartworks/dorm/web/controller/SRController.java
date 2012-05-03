package com.smartworks.dorm.web.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.smartworks.dorm.converter.SRServiceConverter;
import com.smartworks.dorm.domain.Dormitory;
import com.smartworks.dorm.domain.ServiceRequest;
import com.smartworks.dorm.service.DormService;
import com.smartworks.dorm.service.SRService;
import com.smartworks.dorm.web.form.SRForm;
import com.smartworks.platform.AppContextUtil;

@Controller
@RequestMapping("/SR")
public class SRController {
	
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView startPage() {
		ModelAndView model1 = new ModelAndView("srhome");
		return model1;
	}
	
	@RequestMapping(value="/create.form" , method = RequestMethod.GET)
	public ModelAndView create() {
		ModelAndView model1 = new ModelAndView("service_request");
		SRForm srForm = new SRForm();
		model1.addObject("SRForm", srForm);
		DormService dormServ = AppContextUtil.getBean("dormServiceImpl");
		List<Dormitory> dorms =  dormServ.getAllDorms();
		model1.addObject("dorms", dorms);
		return model1;
	}
	
	@RequestMapping(value = "/create.form", method = RequestMethod.POST)
	public ModelAndView create(HttpServletRequest request,
			HttpServletResponse response,
			@ModelAttribute("SRForm") SRForm srForm) {
		SRService srService = AppContextUtil.getBean("SRServiceImpl");

		ServiceRequest sr = SRServiceConverter.convert(srForm);
		srService.createSR(sr);

		ModelAndView model1 = new ModelAndView("service_request");
		model1.addObject("SRForm", srForm);
		return model1;
	}
	
	@RequestMapping(value="/edit.form" , method = RequestMethod.GET)
	public ModelAndView edit(@RequestParam Integer srNumber) {
		ModelAndView model1 = new ModelAndView("service_request");
		SRForm srForm;		
		SRService srService = AppContextUtil.getBean("SRServiceImpl");
		ServiceRequest sr = srService.load(srNumber);
		srForm = SRServiceConverter.convert(sr);
		srForm.setMode("edit");				
		DormService dormServ = AppContextUtil.getBean("dormServiceImpl");
		List<Dormitory> dorms =  dormServ.getAllDorms();
		model1.addObject("dorms", dorms);
		model1.addObject("SRForm", srForm);
		return model1;
	}
	
	@RequestMapping(value="/edit.form", method = RequestMethod.POST)
	public ModelAndView edit(HttpServletRequest request, HttpServletResponse response, @ModelAttribute("SRForm") SRForm srForm) {
		SRService srService = AppContextUtil.getBean("SRServiceImpl");
		
		ServiceRequest sr = SRServiceConverter.convert(srForm);
		srService.update(sr);
		
		ModelAndView model1 = new ModelAndView("service_request");
		model1.addObject("SRForm", srForm);
		return model1;
	}
	
	
	
	

}
