package com.quiz.service;



import java.util.List;

import com.quiz.entity.Quiz;

public interface QuizInterface {

	public Quiz add(Quiz quiz);
	
	
	//get single
	public Quiz getQuiz(Long id);
	
	
	//get all
	public List<Quiz> getAll();
	
	//update quize
	public void updateQuize(long id);
	
}
