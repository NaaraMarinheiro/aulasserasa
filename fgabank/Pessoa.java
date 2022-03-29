package fgabank;

public class Pessoa {

	private String nome;
	private String cpf;
	private String profissao;
	private String rg;
	private String email;
	private String telefone; //metodo construtor é sempre publico e leva sempre o nome da classe
		
	public Pessoa () {
		//metodo construtir default = preenchimento dos taributos é opcional
		
	}
	
	public String getNome() { //exibe os objetos / tipado com retorno
		return nome;
	}
	public void setNome(String nome) { //grava os objetos nos atributos
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
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

	public Pessoa(String nome, String cpf, String profissao, String rg, String email, String telefone) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.profissao = profissao;
		this.rg = rg;
		this.email = email;
		this.telefone = telefone;
	}
	
	
	
}
