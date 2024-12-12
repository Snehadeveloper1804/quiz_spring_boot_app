package org.jsp.quzi.dao.impl;


import java.util.List;
import java.util.Optional;

import org.jsp.quzi.dao.QuestionDao;
import org.jsp.quzi.entity.Question;
import org.jsp.quzi.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Repository;

@Repository
public class QuestionDaoimpl implements QuestionDao{

	@Autowired
	private QuestionRepository repository;
	
	@Override
	public Question saveQuestion(Question question) {
		return repository.save(question);
		
	}

	@Override
	public List<Question> findAllQuestions() {
		return repository.findAll();
	}

	@Override
	public Optional<Question> findQuestionById(int id) {
		return repository.findById(id);
	}

	@Override
	public List<Question> findAllActiveQuestions() {
		return repository.findAllActiveQuestions();
	}

	@Override
	public List<Question> takeQuiz() {
		return repository.findRandamQuestions( PageRequest.of(0, 5));
	}

	

	

	

}
