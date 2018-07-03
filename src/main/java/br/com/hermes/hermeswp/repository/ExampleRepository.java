package br.com.hermes.hermeswp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.hermes.hermeswp.domain.Example;

@Repository
public interface ExampleRepository  extends JpaRepository<Example, Long> {
	
	Example findByNomeAndIdade(String nome, Integer idade);
}
