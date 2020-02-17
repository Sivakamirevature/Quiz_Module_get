package com.example.demo.dao;

import java.util.List;

import com.example.demo.ExceptionsHandling.DBExceptions;
import com.example.demo.model.Quiz;

public interface QuizDao {

	List<Quiz> getAllQuizzes()throws DBExceptions;

	List<Quiz> getQuizByID(int id)throws DBExceptions;

	String createQuiz(Quiz quiz);

}
