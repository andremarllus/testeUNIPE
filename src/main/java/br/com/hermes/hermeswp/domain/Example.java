package br.com.hermes.hermeswp.domain;

import java.io.Serializable;

public class Example  extends Model<Long> implements Serializable {

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
	

}
