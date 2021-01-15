package br.com.alura.gerenciador.servelet;

import java.util.Date;

public class Empresa {

	protected Integer id;
	protected String nome;
	protected Date data = new Date();

	public Date getData() {
		return data;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setData(Date dataCadastro) {
		this.data = dataCadastro;
	}
	@Override
	public String toString() {
		return "Nome da Empresa: " + nome + " Data do Cadastro: " + data;
	}

}
