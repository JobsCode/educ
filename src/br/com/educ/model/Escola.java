package br.com.educ.model;

public class Escola {

	private int idEscola;
	private String nomeEscola;
	private String cnpjEscola;
	private String email;
	private String senha;

	public int getIdEscola() {
		return idEscola;
	}

	public void setIdEscola(int idEscola) {
		this.idEscola = idEscola;
	}

	public String getNomeEscola() {
		return nomeEscola;
	}

	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}

	public String getCnpjEscola() {
		return cnpjEscola;
	}

	public void setCnpjEscola(String cnpjEscola) {
		this.cnpjEscola = cnpjEscola;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
}