package com.quiz.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.quiz.entity.Quiz;
import com.quiz.repository.QuizRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j
public class QuizServiceImpl implements QuizService{

	private final QuizRepository quizRepository;
	
	
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
		log.info("guiz fetched.. quiz: {}", quiz);
		
		return quiz;
	}

	@Override
	public List<Quiz> getAll() {
		
		log.info("getting all quiz");

		List<Quiz> allQuiz = quizRepository.findAll();
		log.info("all quized fetched allQuiz: {}", allQuiz);
		
		return allQuiz;
	}

	
	
}
