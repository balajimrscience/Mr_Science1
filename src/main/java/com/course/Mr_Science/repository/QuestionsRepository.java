package com.course.Mr_Science.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.course.Mr_Science.Model.Questions;


@Repository
public interface QuestionsRepository extends JpaRepository<Questions, Integer> {

}
