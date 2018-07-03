package br.com.hermes.hermeswp.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Index;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

@Entity
@Table(name = "T_EXAMPLE", indexes = {@Index(name = "WP_INDX_IDADES", columnList = "IDADE")})
@DynamicInsert
@DynamicUpdate
public class Example  extends Model<Long> implements Serializable {

	private static final long serialVersionUID = 1L;

	@Column(name = "NOME")
	private String nome;

	@Column(name = "IDADE")
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
