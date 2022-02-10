package hh.swd20.Bookstore.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import hh.swd20.Bookstore.domain.Book;
import hh.swd20.Bookstore.domain.BookRepository;

public class BookstoreController {
			@Autowired
			private BookRepository repository;
	
			// http://localhost:8080/index
			@RequestMapping(value= "/index", method = RequestMethod.GET)
			public String bookstoreIndex(Model model) {		
		        return "bookstore";
			}
			
			@RequestMapping(value= "/booklist", method = RequestMethod.GET)
			public String bookstore(Model model) {		
				model.addAttribute("books", repository.findAll());
		        return "booklist";
			}
}
