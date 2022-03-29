package hh.swd20.Bookstore;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import hh.swd20.Bookstore.domain.Book;
import hh.swd20.Bookstore.domain.BookRepository;

//@RunWith(SpringRunner.class)  //JUnit4
@ExtendWith(SpringExtension.class)  // JUnit5 eli Jupiter
@DataJpaTest
public class BookstoreRepositoryTest {

	@Autowired
	private BookRepository brepository;
	
	@Test // testataan Bookstore Repositoryn findByTitle()-metodin toimivuutta
	public void findByTitleShouldReturnBook() {
		List<Book> book = brepository.findByTitle("Shadow of the Conqueror");
		
		assertThat(book).hasSize(1);
		assertThat(book.get(0).getTitle()).isEqualTo("Shadow of the Conqueror");
	}
	
	@Test // testataan Bookstore Repositoryn save()-metodin toimivuutta
	public void createNewBook() {
		Book book = new Book("Ringworld", "Larry Niven", 1985, "955-5-13-18-17", 32, null);
		brepository.save(book);
		assertThat(book.getId()).isNotNull();
	}
}
