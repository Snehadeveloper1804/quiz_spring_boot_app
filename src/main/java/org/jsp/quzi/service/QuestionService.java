package org.jsp.quzi.service;

import java.util.List;

import org.apache.catalina.User;
import org.jsp.quzi.dto.QuizRandamQuestions;
import org.jsp.quzi.dto.QuizResponse;
import org.jsp.quzi.entity.Question;
import org.jsp.quzi.responsestructure.ResponseStructure;
import org.springframework.http.ResponseEntity;

public interface QuestionService {

	ResponseEntity<?> saveQuestion(Question question);

	ResponseEntity<?> findAllQuestions();

	ResponseEntity<?> findQuestionsById(int id);

	ResponseEntity<?> submitQuiz(List<QuizResponse> quizResponses);

	ResponseEntity<?> takeQuiz();

	ResponseEntity<?> takeQuiz(List<QuizRandamQuestions> quizRandamQuestions);

	ResponseEntity<ResponseStructure<Object>> user();

}
