package br.com.educ.model;

import java.util.Date;

public class Professor {

	private int idProfessor;
	private String nomeProfessor;
	private String rgProfessor;
	private String cpfProfessor;
	private Date dataNascimentoProfessor;
	private char generoProfessor;
	private String email;
	private String senha;
	private String telefoneProfessor;
	private Escola escola;

	public int getIdProfessor() {
		return idProfessor;
	}

	public void setIdProfessor(int idProfessor) {
		this.idProfessor = idProfessor;
	}

	public String getNomeProfessor() {
		return nomeProfessor;
	}

	public void setNomeProfessor(String nomeProfessor) {
		this.nomeProfessor = nomeProfessor;
	}

	public String getRgProfessor() {
		return rgProfessor;
	}

	public void setRgProfessor(String rgProfessor) {
		this.rgProfessor = rgProfessor;
	}

	public String getCpfProfessor() {
		return cpfProfessor;
	}

	public void setCpfProfessor(String cpfProfessor) {
		this.cpfProfessor = cpfProfessor;
	}

	public Date getDataNascimentoProfessor() {
		return dataNascimentoProfessor;
	}

	public void setDataNascimentoProfessor(Date dataNascimentoProfessor) {
		this.dataNascimentoProfessor = dataNascimentoProfessor;
	}

	public char getGeneroProfessor() {
		return generoProfessor;
	}

	public void setGeneroProfessor(char generoProfessor) {
		this.generoProfessor = generoProfessor;
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

	public String getTelefoneProfessor() {
		return telefoneProfessor;
	}

	public void setTelefoneProfessor(String telefoneProfessor) {
		this.telefoneProfessor = telefoneProfessor;
	}

	public Escola getEscola() {
		return escola;
	}

	public void setEscola(Escola escola) {
		this.escola = escola;
	}
}