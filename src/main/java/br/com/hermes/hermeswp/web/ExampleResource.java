package br.com.hermes.hermeswp.web;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.hermes.hermeswp.service.ExampleService;
import br.com.hermes.hermeswp.web.request.ExampleRequest;
import br.com.hermes.hermeswp.web.response.ExampleResponse;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/api/v1/wp", produces = MediaType.APPLICATION_JSON_VALUE)		
public class ExampleResource {

	@Autowired
	private ExampleService exampleService;
	
	@PostMapping("/")
	@ApiOperation(value = "Este serviço eh um example.",notes = "efetua o cadastro de example")
	public ResponseEntity<ExampleResponse> teste(@Valid @RequestBody ExampleRequest request) throws Exception {
		
		//chamada dos metodos so serivce
		
//		return ResponseEntity.ok().body(response);
		return ResponseEntity.ok(new ExampleResponse());

	}
}
