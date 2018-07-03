package br.com.hermes.hermeswp.service.amqp;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Classe reponsavel por se cominicar com o rabbitmq, com o objetivo de enviar a mensagem ao mesmo
 * @author andremarllus
 *
 */

@Component
public class RabbitSender {

	@Autowired
	private RabbitTemplate template;
	
	@Autowired
	private Queue queue;
	
	/**
	 * Meotodo reponsavel por enviar a mensagem a fila do rabbitmq
	 * @param mensagem
	 */
	public void sender(String mensagem) {
		this.template.convertAndSend(queue.getName(), mensagem);
	}
	
}
