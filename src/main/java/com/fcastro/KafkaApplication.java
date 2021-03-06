package com.fcastro;

import com.fcastro.message.Message;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;

import java.time.LocalDateTime;

@SpringBootApplication
public class KafkaApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(KafkaTemplate<String, Message> messageKafkaTemplate){
		return args -> {
			messageKafkaTemplate.send("message-topic",
						new Message("Hello Kafka! ", LocalDateTime.now()));
		};
	}

}
