package br.com.hermes.hermeswp.web.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "Objeto de Resposta do SMSHermes")
public class ExampleResponse {

	@ApiModelProperty(value = "Nome do example", example = "Example")
	private String nome;

	@ApiModelProperty(value = "Idade do example", example = "100")
	private Integer idade;

	public ExampleResponse() {
	}

	public ExampleResponse(String nome, Integer idade) {
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
