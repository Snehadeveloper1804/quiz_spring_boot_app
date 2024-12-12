package org.jsp.quzi.dao;

import java.util.List;
import java.util.Optional;

import org.apache.catalina.User;
import org.jsp.quzi.entity.Question;

import lombok.Builder;


public interface QuestionDao {

	Question saveQuestion(Question question);

	List<Question> findAllQuestions();

	Optional<Question> findQuestionById(int id);

	List<Question> findAllActiveQuestions();

	List<Question> takeQuiz();

	

	

	

	
	
		
}
