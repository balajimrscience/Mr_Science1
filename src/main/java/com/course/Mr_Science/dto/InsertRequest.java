package com.course.Mr_Science.dto;

import com.course.Mr_Science.Model.Test;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class InsertRequest {

	
	private Test test;

	
}
