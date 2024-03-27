package comgeneration.blogpessoal;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.ContextConfiguration;

import com.generation.blogpessoal.BlogpessoalApplication;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@ContextConfiguration(classes = BlogpessoalApplication.class)
public abstract class BlogpessoalApplicationTests {

	@Test
	void contextLoads() {
	}

}
