package com.quiz.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quiz.entity.Quiz;
import com.quiz.service.QuizService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("quiz")
@RequiredArgsConstructor
@Slf4j
public class QuizController {

	private final QuizService quizService;
	
	
	@PostMapping
	public Quiz create(@RequestBody Quiz quiz) {
		log.info("creating Quiz... quiz: {}", quiz);
		
		return  quizService.create(quiz);	
	}
	
	
	@GetMapping("/{id}")
	public Quiz getQuiz(@PathVariable Long id) {
		log.info("getting quiz by id {}", id);
		
		return quizService.getQuiz(id);
	}
	
	
	@GetMapping
	public List<Quiz> getAll(){
		log.info("getting all quiz in list");
		
		return quizService.getAll();
	}
	
}
