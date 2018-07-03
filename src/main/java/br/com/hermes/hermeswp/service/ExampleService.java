package br.com.hermes.hermeswp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.hermes.hermeswp.repository.ExampleRepository;

@Service
public class ExampleService {

	@Autowired
	private ExampleRepository exampleRepository;
}
