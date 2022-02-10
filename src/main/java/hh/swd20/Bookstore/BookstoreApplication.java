package hh.swd20.Bookstore;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import hh.swd20.Bookstore.domain.Book;
import hh.swd20.Bookstore.domain.BookRepository;

@SpringBootApplication
public class BookstoreApplication {
	private static final Logger log = LoggerFactory.getLogger(BookstoreApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner bookDemo(BookRepository repository) {
		return (args) -> {
			log.info("save a couple of books");
			repository.save(new Book("Shadow of the Conqueror", "Shad M. Brooks", 2019, "945-3-16-14-15", 32));
			repository.save(new Book("The Way of Kings", "Brandon Sanderson", 2010, "9564-17-15-16", 35));	
			
			log.info("fetch all books");
			for (Book book : repository.findAll()) {
				log.info(book.toString());
			}

		};

}
}
