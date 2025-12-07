package com.quiz.service;



import java.util.List;

import com.quiz.entity.Quiz;

public interface QuizService {

	//create 
	public Quiz create(Quiz quiz);
	
	
	//get single
	public Quiz getQuiz(Long id);
	
	
	//get all
	public List<Quiz> getAll();
	
	
}
