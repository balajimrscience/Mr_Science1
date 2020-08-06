package com.course.Mr_Science.Model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;



@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name= "test_preface")
public class Test {
	
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	private int id;
	private String testname;
	private String hostname;
	private int grade;
	private String group_name;
	private String subject_name;
	private int total_questions;
	private int total_marks;
	private int time;
	
	@OneToMany(targetEntity= Questions.class,cascade = CascadeType.ALL)
	@JoinColumn(name="cp_fk",referencedColumnName="id")
	private List<Questions> questions;
}
