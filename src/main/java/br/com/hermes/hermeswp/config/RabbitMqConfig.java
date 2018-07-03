package br.com.hermes.hermeswp.config;

import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMqConfig {

	@Value("${hermes.rabbitmq.queue}")
	private String queue;
	
	@Bean
	public Queue hermesSMS() {
		return new Queue(queue);
	}
	
}
