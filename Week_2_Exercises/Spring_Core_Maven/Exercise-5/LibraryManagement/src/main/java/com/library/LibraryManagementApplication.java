package com.library;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.library.service.BookService;
import org.springframework.context.ApplicationContext;

public class LibraryManagementApplication {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		BookService bookService = (BookService) context.getBean("bookService");
		bookService.testing();

	}
}