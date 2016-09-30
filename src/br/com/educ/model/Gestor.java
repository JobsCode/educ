package br.com.educ.model;

import java.util.Date;

public class Gestor {

	private int idGestor;
	private String nomeGestor;
	private String rgGestor;
	private String cpfGestor;
	private Date dataNascimentoGestor;
	private char generoGestor;
	private String email;
	private String senha;
	private String telefoneGestor;
	private byte[] fotoGestor;
	private Escola escola;

	public int getIdGestor() {
		return idGestor;
	}

	public void setIdGestor(int idGestor) {
		this.idGestor = idGestor;
	}

	public String getNomeGestor() {
		return nomeGestor;
	}

	public void setNomeGestor(String nomeGestor) {
		this.nomeGestor = nomeGestor;
	}

	public String getRgGestor() {
		return rgGestor;
	}

	public void setRgGestor(String rgGestor) {
		this.rgGestor = rgGestor;
	}

	public String getCpfGestor() {
		return cpfGestor;
	}

	public void setCpfGestor(String cpfGestor) {
		this.cpfGestor = cpfGestor;
	}

	public Date getDataNascimentoGestor() {
		return dataNascimentoGestor;
	}

	public void setDataNascimentoGestor(Date dataNascimentoGestor) {
		this.dataNascimentoGestor = dataNascimentoGestor;
	}

	public char getGeneroGestor() {
		return generoGestor;
	}

	public void setGeneroGestor(char generoGestor) {
		this.generoGestor = generoGestor;
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

	public String getTelefoneGestor() {
		return telefoneGestor;
	}

	public void setTelefoneGestor(String telefoneGestor) {
		this.telefoneGestor = telefoneGestor;
	}

	public byte[] getFotoGestor() {
		return fotoGestor;
	}

	public void setFotoGestor(byte[] fotoGestor) {
		this.fotoGestor = fotoGestor;
	}

	public Escola getEscola() {
		return escola;
	}

	public void setEscola(Escola escola) {
		this.escola = escola;
	}
}