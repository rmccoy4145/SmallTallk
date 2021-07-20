package com.mccoy.smalltalk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("com.mccoy.smalltalk.repository")
@EntityScan("com.mccoy.smalltalk.model")
@SpringBootApplication
@ComponentScan("com.mccoy.smalltalk")
public class SmalltalkApplication {

	public static void main(String[] args) {
		SpringApplication.run(SmalltalkApplication.class, args);
		System.out.println("classpath is ---" + System.getProperty("java.class.path"));
	}

}
