package com.course.Mr_Science.dto;

import java.util.ArrayList;
import java.util.List;

import com.course.Mr_Science.Model.Questions;
import com.course.Mr_Science.Model.Test;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
public class TestCreationDto {
	
	private List<Test> test =new ArrayList<>();
	
	

}
