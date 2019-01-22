package h2demo.demo;

import h2demo.demo.domain.Subscriber;
import h2demo.demo.domain.SubscriberReposiory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(SubscriberReposiory repository) {
		return args -> {
			repository.save(new Subscriber("Liubomyr", "Izdepskyi", "lizdepskij@gmail.com"));

		};
	}
}
