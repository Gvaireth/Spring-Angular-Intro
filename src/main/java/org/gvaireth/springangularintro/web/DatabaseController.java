package org.gvaireth.springangularintro.web;

import java.util.List;

import org.gvaireth.springangularintro.database.Book;
import org.gvaireth.springangularintro.database.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/db")
public class DatabaseController {

	@Autowired
	BookRepository bookRepository;

	@RequestMapping("/list")
	public List<Book> listBooks() {
		return bookRepository.findAll();
	}
}
