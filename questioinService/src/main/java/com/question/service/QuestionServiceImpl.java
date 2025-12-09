package com.question.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.question.entity.Question;
import com.question.repository.QuestionRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j
public class QuestionServiceImpl implements QuestionService{

	private final QuestionRepository questionRepository;
	
	
	@Override
	public Question create(Question question) {
		log.info("creating quiz: {}", question);
		
		Question save = questionRepository.save(question);
		log.info("Quiz created quiz: {}", save);
		
		return save;
	}

	@Override
	public Question getQuiz(Long id) {
		log.info("getting quiz.... id: {}", id);
		
		Question quiz = questionRepository.findById(id).orElseThrow(() -> new RuntimeException("Question not find."));
		log.info("guiz fetched.. quiz: {}", quiz);
		
		return quiz;
	}

	@Override
	public List<Question> getAll() {
		
		log.info("getting all quiz");

		List<Question> allQuiz = questionRepository.findAll();
		log.info("all quized fetched allQuiz: {}", allQuiz);
		
		return allQuiz;
	}

	@Override
	public List<Question> getByQuizId(Long id) {
		
		return questionRepository.getByQuizId(id);
	}

	
	
}
