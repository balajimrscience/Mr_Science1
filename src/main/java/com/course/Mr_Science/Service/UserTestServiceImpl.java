package com.course.Mr_Science.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.course.Mr_Science.Model.Questions;
import com.course.Mr_Science.Model.Test;
import com.course.Mr_Science.Model.User_platform_questions;

@Service
public class UserTestServiceImpl implements UserTestService {
	
	
	Test master_copy = new Test();

	@Override
	public Test userTest(Test test) {
		
		master_copy = test;
		return null;
	}

	@Override
	public int evaluate(List<Questions> questions, List<User_platform_questions> user_platform_questions) {
		int marks=0;
		List<String> master_answers =new ArrayList<>();
		List<String> user_answers =new ArrayList<>();
		
		for(Questions answers : questions) {
			
			master_answers.add(answers.getAnswer());
		}
		
		for(User_platform_questions answers : user_platform_questions) {
			
			user_answers.add(answers.getUser_answer());
		}
		
		for(int temp =0;temp<master_answers.size();temp++)
		{
			if((master_answers.get(temp)).equals(user_answers.get(temp)))
			{
				marks=marks+1;
			}
		}
		
		return marks;
	}

	

	
}
