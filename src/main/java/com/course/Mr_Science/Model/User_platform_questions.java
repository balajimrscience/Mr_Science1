package com.course.Mr_Science.Model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@AllArgsConstructor
@NoArgsConstructor
@Data
public class User_platform_questions {
	

	private int id;
	
	private String subject;
	private String question;
	private String option_1;
	private String option_2;
	private String option_3;
	private String option_4;
	private String answer;
	private String explanation;
	private String user_answer;
	
	

}
