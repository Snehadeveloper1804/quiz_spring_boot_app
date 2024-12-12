package org.jsp.quzi.repository;



import java.util.List;


import org.jsp.quzi.entity.Question;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import lombok.Builder;


public interface QuestionRepository extends JpaRepository<Question ,Integer>{

	@Query("select q from Question q where q.status='ACTIVE'")
	List<Question> findAllActiveQuestions();
	
	@Query("SELECT q FROM Question q ORDER BY FUNCTION('RAND')ASC")
	List<Question> findRandamQuestions(PageRequest pageable);

//	List<User> findByuser();
	
	

	
	
			
		
}
