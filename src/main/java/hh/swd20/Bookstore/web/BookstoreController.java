package hh.swd20.Bookstore.web;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class BookstoreController {
			// http://localhost:8080/index
			@RequestMapping(value= "/index", method = RequestMethod.GET)
			public String bookstore(Model model) {		
				return "temp"; // autolista.html-templaten nimi palautetaan
			}
}
