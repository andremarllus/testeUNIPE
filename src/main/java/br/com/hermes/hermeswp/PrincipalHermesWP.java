package br.com.hermes.hermeswp;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Import;
import org.springframework.core.env.Environment;

import br.com.hermes.hermeswp.config.SwaggerConfig;
import br.com.hermes.hermeswp.util.LoggerPadrao;

@SpringBootApplication
@Import(SwaggerConfig.class)
@EnableAutoConfiguration
public class PrincipalHermesWP extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {

		return application.sources(PrincipalHermesWP.class);
	}

	public static void main(String[] args) throws UnknownHostException {
		SpringApplication app = new SpringApplication(PrincipalHermesWP.class);

		Environment env = app.run(args).getEnvironment();

		LoggerPadrao.startApplication("\n----------------------------------------------------------\n\t" +
                "Hermes-WP está rodando! Acesse uma das URLs:\n\t" +
				"IP do ELK: \t{}\n\t"+
				"Porta do ELK: \t{}\n\t"+
				"Ip do Banco: \t{}\n\t"+
                "Local: \t\thttp://localhost:{}{}\n\t" +
                "Externa: \thttp://{}:{}{}\n----------------------------------------------------------",
            env.getProperty("elk.ip"),
            env.getProperty("elk.porta"),
            env.getProperty("banco.ip"),
            env.getProperty("server.port"),
            env.getProperty("server.servlet.context-path"),
            InetAddress.getLocalHost().getHostAddress(),
            env.getProperty("server.port"),
            env.getProperty("server.servlet.context-path"));
		
	}
}
