package com.quiz.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.quiz.controller.client.QuestionClient;
import com.quiz.entity.Quiz;
import com.quiz.repository.QuizRepository;
import com.quiz.response.QuestionRes;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j
public class QuizServiceImpl implements QuizService{

	private final QuizRepository quizRepository;
	
	private final QuestionClient questionClient;
	
	
	@Override
	public Quiz create(Quiz quiz) {
		log.info("creating quiz: {}", quiz);
		
		Quiz save = quizRepository.save(quiz);
		log.info("Quiz created quiz: {}", save);
		
		return save;
	}

	@Override
	public Quiz getQuiz(Long id) {
		log.info("getting quiz.... id: {}", id);
		
		Quiz quiz = quizRepository.findById(id).orElseThrow(() -> new RuntimeException("Quiz not find."));
		
		quiz.setQuestions(questionClient.getQuestionOfQuiz(quiz.getId()));
		
		return quiz;
	}

	
	@Override
	public List<Quiz> getAll() {
		
		log.info("getting all quiz");

		List<Quiz> quizzes = quizRepository.findAll();
		
		quizzes.stream().map(quiz -> {
			quiz.setQuestions(questionClient.getQuestionOfQuiz(quiz.getId()));
			return quiz;
		}).toList();
		
		return quizzes;
	}

	
}
