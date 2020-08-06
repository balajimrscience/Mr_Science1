package com.course.Mr_Science.dto;

import java.util.ArrayList;
import java.util.List;

import com.course.Mr_Science.Model.Questions;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
public class QuestionCreationDto {
	
	private List<Questions> questions = new ArrayList<>();
	
	public void addQuestion(Questions question) {
        this.questions.add(question);
    }

}
