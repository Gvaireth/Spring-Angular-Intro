package org.gvaireth.springangularintro.web;

import java.util.List;

import org.gvaireth.springangularintro.database.Book;
import org.gvaireth.springangularintro.database.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/db")
public class DatabaseController {

	@Autowired
	BookRepository bookRepository;

	@RequestMapping("/book/findall")
	public List<Book> findAll() {
		return bookRepository.findAll();
	}

	@RequestMapping("/book/get/{id}")
	public Book find(@PathVariable Long id) {
		return bookRepository.findOne(id);
	}

	@RequestMapping("/book/find/{name}")
	public List<Book> find(@PathVariable String name) {
		return bookRepository.findByName(name);
	}

	@RequestMapping(value = "/book/add", method = RequestMethod.PUT)
	public String addBook(@RequestBody Book book) {
		System.out.println(book);
		book.setId(null);
		bookRepository.save(book);
		return "We now have " + bookRepository.count() + " books!";
	}
}
