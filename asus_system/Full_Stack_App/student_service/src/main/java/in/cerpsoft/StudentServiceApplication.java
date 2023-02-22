package in.cerpsoft;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentServiceApplication {
    private static final Logger logger = LoggerFactory.getLogger(String.valueOf("StudentServiceApplication"));
	public static void main(String[] args) {
        logger.info("Application As It Runs :-) ");
		SpringApplication.run(StudentServiceApplication.class, args);
	}

}
