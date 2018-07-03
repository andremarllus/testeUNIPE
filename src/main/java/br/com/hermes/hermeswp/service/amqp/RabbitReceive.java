package br.com.hermes.hermeswp.service.amqp;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.hermes.hermeswp.service.ExampleService;
/**
 * Clase responsavel por receber as mensagens da fila do hermes sms;
 * @author andremarllus
 *
 */

@RabbitListener(queues = "${hermes.rabbitmq.queue}")
@Component
public class RabbitReceive {

	@Autowired
	private ExampleService exampleService;
	
	/**
	 * Recebe mensagem da fila e envia para o smsHermesService para ser enviada ao cliente final
	 * @param mensagem
	 */
	@RabbitHandler
	public void receive(String mensagem) {
//		exampleService.blablabal()
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
