package br.com.unipe.domain;

import java.io.Serializable;
import java.util.Comparator;

public class Example  implements Serializable, Comparator<Example> {

	private static final long serialVersionUID = 1L;

	private String nome;

	private Integer idade;

	
	public Example() {
	}

	public Example(String nome, Integer idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	@Override
	public int compare(Example o1, Example o2) {
		return o1.getNome().compareTo(o2.getNome());
	}

}
