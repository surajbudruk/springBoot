package Cyber.success.SpringBootmvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages ={"controller"})
public class SpringBootmvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootmvcApplication.class, args);
	}

}
