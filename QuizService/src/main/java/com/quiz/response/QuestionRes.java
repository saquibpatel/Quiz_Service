package com.quiz.response;

import lombok.Data;

@Data
public class QuestionRes {
	
	private long id;
	private String question;	
	
	private int quizId;
}
