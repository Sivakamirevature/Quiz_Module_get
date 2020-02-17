package com.example.demo.dao;

import java.util.List;
import javax.management.Query;
import javax.persistence.TypedQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.ExceptionsHandling.DBExceptions;
import com.example.demo.model.Quiz;
@Repository
public class QuizDaoImp implements QuizDao {
	@Autowired
	SessionFactory SessionFactory;

	@Override
	public List<Quiz> getAllQuizzes()throws DBExceptions {
		List<Quiz> quizzes;
		try {
		Session session = SessionFactory.getCurrentSession();
		String queryString = "From Quiz";
		TypedQuery<Quiz> query = session.createQuery(queryString);
		quizzes =  ((org.hibernate.query.Query) query).list();
		}
		catch(Exception e) {
			throw new DBExceptions("Fetching the Data Failed", e);
		}
		return quizzes;
	}
	@Override
	public List<Quiz> getQuizByID(int id) throws DBExceptions {
		List<Quiz> quizzesList;
		try {
		Session session = SessionFactory.getCurrentSession();
		String queryString = "From Quiz where id=:id";
		TypedQuery<Quiz> query = (TypedQuery<Quiz>) session.createQuery(queryString);
		query.setParameter("id",id);
		quizzesList = ((org.hibernate.query.Query) query).list();
		}
		catch(Exception e) {
			throw new DBExceptions("Fetching the Data Failed", e);	
		}
		return quizzesList;	
	}
	@Override
	public String createQuiz(Quiz quiz) {
		return null;
	}
}