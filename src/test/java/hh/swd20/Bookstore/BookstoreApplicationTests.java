package hh.swd20.Bookstore;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import hh.swd20.Bookstore.web.BookstoreController;

//@RunWith(SpringRunner.class) // JUnit4
@ExtendWith(SpringExtension.class)   // JUnit5 eli Jupiter
@SpringBootTest
class BookstoreApplicationTests {

	@Autowired
	private BookstoreController bookstoreController;
	
	@Test
	public void contextLoads() {
		assertThat(bookstoreController).isNotNull();
	}

}
