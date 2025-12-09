package com.question.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.question.entity.Question;
import com.question.service.QuestionService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("questions")
@RequiredArgsConstructor
@Slf4j
public class QuestionController {

   
	private final QuestionService questionService;

   
	
	@PostMapping
	public Question create(@RequestBody Question question) {
		log.info("creating Quiz... quiz: {}", question);
		
		return  questionService.create(question);	
	}
	
	
	@GetMapping("/{id}")
	public Question getQuiz(@PathVariable Long id) {
		log.info("getting quiz by id {}", id);
		
		return questionService.getQuiz(id);
	}
	
	
	@GetMapping
	public List<Question> getAll(){
		log.info("getting all quiz in list");
		
		return questionService.getAll();
	}
	
	
	@GetMapping("/quiz/{id}")
	public List<Question> getByQuizId(@PathVariable long id) {
		return questionService.getByQuizId(id);
	}
	
}
