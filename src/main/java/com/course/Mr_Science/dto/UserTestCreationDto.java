package com.course.Mr_Science.dto;

import java.util.ArrayList;
import java.util.List;

import com.course.Mr_Science.Model.Questions;
import com.course.Mr_Science.Model.User_platform_questions;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserTestCreationDto {
	
	private String testname;
	private int grade;
	private int total_marks;
	private int time;
	private String username = new String();
	private String email = new String();
	private String mobile = new String();
	
	private List<User_platform_questions> questions;
	
	public void addTestDetails(String testname,int grade,int total_marks,int time) {
		this.testname = testname;
		this.grade = grade;
		this.total_marks = total_marks;
		this.time = time;
		
	}
	
	public void addQuestions(List<User_platform_questions> questions) {
		this.questions =  new ArrayList<User_platform_questions>(questions);
	}

}
