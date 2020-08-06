package com.course.Mr_Science.controller;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.course.Mr_Science.Model.Questions;
import com.course.Mr_Science.Model.Test;
import com.course.Mr_Science.dto.QuestionCreationDto;
import com.course.Mr_Science.repository.QuestionsRepository;
import com.course.Mr_Science.repository.TestRepository;

@Controller
@SessionAttributes("test")
public class AdminTestController {
	
	
	/*
	 * RestTemplate restTemplate = new RestTemplate();
	 * 
	 * String createUrl = "http://localhost:8081/create";
	 * 
	 * 
	 * 
	 * HttpHeaders headers = new HttpHeaders();
	 */
	 

	@Autowired
	private TestRepository testRepository;
	
	@Autowired
	private QuestionsRepository questionsRepository;
	
	@RequestMapping("/admin")
	public String admin(Model model) {
		
		  Test test = new Test();
	      model.addAttribute("test", test);
	         
		
		return "admin";
	}
	

	@RequestMapping("/preface")
	public String quiz(@ModelAttribute("test") Test test,Model model) {
		
		System.out.println(test.getTestname());
		
		model.addAttribute("test",test);
	
		QuestionCreationDto questionForm = new QuestionCreationDto();
		
		for(int i=0;i<test.getTotal_questions();i++) {
			
			Questions question = new Questions();
			questionForm.addQuestion(question);
			
			
		}
	
		model.addAttribute("questions",questionForm);
		
		
		return "quiz";
	}
	
	
	
	@RequestMapping("/insertquiz")
	public String insertTest(@ModelAttribute("questions")QuestionCreationDto questionForm,Model model,@SessionAttribute("test") Test test) {
		
		System.out.println(test.getTestname());
		
		test.setQuestions(questionForm.getQuestions());
		
		testRepository.save(test);
		/*
		 * HttpEntity<Test> httpEntity = new HttpEntity<>(test, headers);
		 * 
		 * Test test1 = restTemplate.postForObject(createUrl, httpEntity, Test.class);
		 */
		return "admin";
		
		
	}
	
	
	
	
	

}
