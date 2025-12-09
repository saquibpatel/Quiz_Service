package com.question.service;



import java.util.List;

import com.question.entity.Question;

public interface QuestionService {

	//create 
	public Question create(Question question);
	
	
	//get single
	public Question getQuiz(Long id);
	
	
	//get all
	public List<Question> getAll();
	
	//get by quizid
	public List<Question> getByQuizId(Long id);
	
	
}
