package com.course.Mr_Science.Service;

import java.util.List;

import com.course.Mr_Science.Model.Questions;
import com.course.Mr_Science.Model.Test;
import com.course.Mr_Science.Model.User_platform_questions;

public interface UserTestService {
	
	public Test userTest(Test test);
	
	public int evaluate(List<Questions>questions,List<User_platform_questions> user_platform_questions );

}
