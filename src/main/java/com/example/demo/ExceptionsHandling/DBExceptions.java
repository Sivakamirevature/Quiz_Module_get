package com.example.demo.ExceptionsHandling;

public class DBExceptions extends Exception {

	public DBExceptions(String message, Throwable t) {
		super(message, t);
	}
}