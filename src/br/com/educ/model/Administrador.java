package br.com.educ.model;

public class Administrador {

	private int	idAdministrador;
	private String nomeAdministrador;
	private String email;
	private String senha;
	private byte[] fotoAdministrador;

	public int getIdAdministrador() {
		return idAdministrador;
	}

	public void setIdAdministrador(int idAdministrador) {
		this.idAdministrador = idAdministrador;
	}

	public String getNomeAdministrador() {
		return nomeAdministrador;
	}

	public void setNomeAdministrador(String nomeAdministrador) {
		this.nomeAdministrador = nomeAdministrador;
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

	public byte[] getFotoAdministrador() {
		return fotoAdministrador;
	}

	public void setFotoAdministrador(byte[] fotoAdministrador) {
		this.fotoAdministrador = fotoAdministrador;
	}
}