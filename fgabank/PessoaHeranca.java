package fgabank;

public class PessoaHeranca {

	private String nome;
	private String email;
	private String telefone; //metodo construtor é sempre publico e leva sempre o nome da classe
		
	public PessoaHeranca () {
		//metodo construtor default = preenchimento dos atributos é opcional
		
	}
	
	public String getNome() { //exibe os objetos / tipado com retorno
		return nome;
	}
	public void setNome(String nome) { //grava os objetos nos atributos
		this.nome = nome;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public PessoaHeranca(String nome, String email, String telefone) {
		super();
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
	}
	
	
	
}
