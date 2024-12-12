package org.jsp.quzi.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.apache.catalina.User;
import org.jsp.quzi.dao.QuestionDao;
import org.jsp.quzi.dto.QuestionDto;
import org.jsp.quzi.dto.QuizRandamQuestions;
import org.jsp.quzi.dto.QuizResponse;
import org.jsp.quzi.entity.Question;
import org.jsp.quzi.exceptionclasses.InvalidQuestionIdException;
import org.jsp.quzi.exceptionclasses.NoQuestionFoundException;
import org.jsp.quzi.responsestructure.ResponseStructure;
import org.jsp.quzi.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import lombok.Builder;


@Service
@Builder
public class QuestionServiceimpl implements QuestionService{

	@Autowired
	private QuestionDao dao;
	
	@Override
	public ResponseEntity<?> saveQuestion(Question question) {
    question=dao.saveQuestion(question);
    return ResponseEntity.status(HttpStatus.OK).body(ResponseStructure.builder().httpStatus(HttpStatus.OK.value()).message("Question Saved Successfully").
			body(question).build());
  }

	@Override
	public ResponseEntity<?> findAllQuestions() {
//		List<Question> questions = dao.findAllQuestions();
		List<Question> questions =dao.findAllActiveQuestions();
		
		List<QuestionDto> dtolist= new ArrayList<>();
		for(Question q:questions) {
			QuestionDto qdto=new QuestionDto(q.getTitle(),q.getA(),q.getB(),q.getC(),q.getD());
		}
			
		if(dtolist.isEmpty())
			throw new NoQuestionFoundException("no question found in database");
		return ResponseEntity.status(HttpStatus.OK).body(ResponseStructure.builder().httpStatus(HttpStatus.OK.value()).message("All questions are found.....").
				body(dtolist).build());
	}

	@Override
	public ResponseEntity<?> findQuestionsById(int id) {
	Optional<Question> optional= dao.findQuestionById(id);
	if(optional.isEmpty())
		throw new InvalidQuestionIdException("Invalid Question Id");
	return ResponseEntity.status(HttpStatus.OK).body(ResponseStructure.builder().httpStatus(HttpStatus.OK.value()).message("Invalid Question id").
			body(optional.get()).build());
	}

	
	@Override
	public ResponseEntity<?> submitQuiz(List<QuizResponse> quizResponses) {
		int c=0;
		for(QuizResponse qr:quizResponses) {
	 Optional<Question> q=dao.findQuestionById(qr.getId());
//		if(q.isEmpty())
//			throw new InvalidQuestionIdException("invalid Question id unable to calculate");
		Question question=q.get();
		if(question.getAnswer().equalsIgnoreCase(qr.getAnswer())) {
			c++;
		}
		
		}		
		return ResponseEntity.status(HttpStatus.OK).body(ResponseStructure.builder().httpStatus(HttpStatus.OK.value()).message("submit succeesfully").
				body("Your score:" +c).build());
	}
	

	@Override
	public ResponseEntity<?> takeQuiz() {
	List<Question> allQuestions=dao.takeQuiz();
	 if (allQuestions.isEmpty()) {
         throw new NoQuestionFoundException("No questions available for the quiz");
     }
	 return ResponseEntity.status(HttpStatus.OK).body(ResponseStructure.builder().httpStatus(HttpStatus.OK.value()).message("Quiz Questions Retrieved Successfully").
				body(allQuestions).build());
	}

	
//
//	@Override
//	public ResponseEntity user() {
//		List<User> u=dao.User();
//		return ResponseEntity.status(HttpStatus.OK).body(ResponseStructure.builder().httpStatus(HttpStatus.OK.value()).message("Invalid Question id").
//				body(u).build());
//		}

	
	@Override
	public ResponseEntity<?> takeQuiz(List<QuizRandamQuestions> quizRandamQuestions) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<ResponseStructure<Object>> user() {
		// TODO Auto-generated method stub
		return null;
	}
}
