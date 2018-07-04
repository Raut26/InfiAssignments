package infy.assignment;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * Entry point for spring boot Application
 *
 */
@SpringBootApplication(scanBasePackages = "infy.assignment")
public class AssignmentSpringBootApp {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(AssignmentSpringBootApp.class, args);
		}
}
