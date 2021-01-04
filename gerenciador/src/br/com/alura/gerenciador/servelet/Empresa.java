package br.com.alura.gerenciador.servelet;

public class Empresa {

	protected Integer id;
	protected String nome;
	protected String data;

	public String getData() {
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
	public void setData(String dataCadastro){
		
		this.data = dataCadastro;
	}
	
	
	@Override
	public String toString() {
		return "Nome da Empresa: " + nome + " Data do Cadastro: " + data;
	}

}
