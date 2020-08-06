package com.course.Mr_Science.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.client.RestTemplate;

import com.course.Mr_Science.Model.Questions;
import com.course.Mr_Science.Model.Test;
import com.course.Mr_Science.dto.QuestionCreationDto;
import com.course.Mr_Science.dto.TestCreationDto;
import com.course.Mr_Science.repository.QuestionsRepository;
import com.course.Mr_Science.repository.TestRepository;


@Controller
@SessionAttributes("test")
public class indexController {
	
	 TestCreationDto testcreation  = new TestCreationDto();
	
	 RestTemplate restTemplate = new RestTemplate();
	 
	 String allTestUrl = "http://localhost:8081/allTest";
	 
	 HttpHeaders headers = new HttpHeaders();
	
	 @Autowired
		private TestRepository testRepository;
		
		@Autowired
		private QuestionsRepository questionsRepository;
	
	
	@RequestMapping("/")
	public String index(Model model) {
		
		
		//List<Test> allTest = new ArrayList<>();
		/* Test[] response = restTemplate.getForObject(allTestUrl,Test[].class); */
		List<Test> allTest = testRepository.findAll();
		
		 
		 model.addAttribute("allTest",allTest);

		return "index";
	}
	
	
	@RequestMapping("/test")
	public String test() {
		
		return "testSeries";
	}
	
	
	
	
	
	
}
