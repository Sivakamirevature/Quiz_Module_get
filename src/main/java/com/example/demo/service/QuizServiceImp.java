package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.ExceptionsHandling.DBExceptions;
import com.example.demo.dao.QuizDao;
import com.example.demo.model.Quiz;

@Service
public class QuizServiceImp implements QuizService {
	@Autowired
	QuizDao quizdao;

	@Override
	public List<Quiz> getAllQuizzes() throws DBExceptions{
		return quizdao.getAllQuizzes();
	}

	@Override
	public List<Quiz> getQuizByID(int id)throws DBExceptions {
		return quizdao.getQuizByID(id);
	}

	@Override
	public String createQuiz(Quiz quiz) throws DBExceptions {
		return quizdao.createQuiz(quiz);
	}
}