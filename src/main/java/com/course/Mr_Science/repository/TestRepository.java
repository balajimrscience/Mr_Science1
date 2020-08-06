package com.course.Mr_Science.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.course.Mr_Science.Model.Test;


@Repository
public interface TestRepository extends JpaRepository<Test, String> {
	
	public Test findById(int id);

}
