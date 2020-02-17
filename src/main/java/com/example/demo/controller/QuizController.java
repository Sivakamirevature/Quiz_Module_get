package com.example.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.example.demo.ExceptionsHandling.DBExceptions;
import com.example.demo.model.Quiz;
import com.example.demo.service.QuizService;
@RestController
@RequestMapping("Quizzes")
public class QuizController {
		@Autowired
		QuizService quizservice;
		
		@GetMapping(value = "/getAllQuizzes")
		public List<Quiz> getAllUser() throws DBExceptions {
			List<Quiz> quizzes = quizservice.getAllQuizzes();
			return quizzes;
		}
		
		@GetMapping(value ="/getQuizByID/{id}")
		public List<Quiz> getQuizById(@PathVariable int id) throws DBExceptions{
			List<Quiz> quizzesList = quizservice.getQuizByID(id);
			
			return quizzesList;
		}
		@PostMapping(value="/doCreateQuizzes")
		public String createQuiz(Quiz quiz) throws DBExceptions{
			return quizservice.createQuiz(quiz);
		}
}