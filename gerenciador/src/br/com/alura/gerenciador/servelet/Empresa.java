package br.com.alura.gerenciador.servelet;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Empresa {
	
	private Integer id;
	private String nome;
	private Date data;
	private Double valor;
	
	public Date getData() {
		return data;
	}
	public Double getValor() {
		return valor;
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
	
	@Override
	public String toString() {
	
		return "Nome da Empresa: "+nome+" Data do Cadastro: "+data ;
	}
}
