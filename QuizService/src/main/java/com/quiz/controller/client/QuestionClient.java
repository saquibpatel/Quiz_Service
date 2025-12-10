package com.quiz.controller.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.quiz.response.QuestionRes;


@FeignClient(name = "QUESTION-SERVICE" )
public interface QuestionClient {

	@GetMapping("/questions/quiz/{quizId}")
	List<QuestionRes> getQuestionOfQuiz(@PathVariable long quizId);
	
}
