package br.com.educ.model;

import java.util.Date;

public class Especialista {

	private int idEspecialista;
	private String nomeEspecialista;
	private String rgEspecialista;
	private String cpfEspecialista;
	private Date dataNascimentoEspecialista;
	private char generoEspecialista;
	private String email;
	private String senha;
	private String telefoneEspecialista;
	private Disciplina disciplina;
	private Area area;

	public int getIdEspecialista() {
		return idEspecialista;
	}

	public void setIdEspecialista(int idEspecialista) {
		this.idEspecialista = idEspecialista;
	}

	public String getNomeEspecialista() {
		return nomeEspecialista;
	}

	public void setNomeEspecialista(String nomeEspecialista) {
		this.nomeEspecialista = nomeEspecialista;
	}

	public String getRgEspecialista() {
		return rgEspecialista;
	}

	public void setRgEspecialista(String rgEspecialista) {
		this.rgEspecialista = rgEspecialista;
	}

	public String getCpfEspecialista() {
		return cpfEspecialista;
	}

	public void setCpfEspecialista(String cpfEspecialista) {
		this.cpfEspecialista = cpfEspecialista;
	}

	public Date getDataNascimentoEspecialista() {
		return dataNascimentoEspecialista;
	}

	public void setDataNascimentoEspecialista(Date dataNascimentoEspecialista) {
		this.dataNascimentoEspecialista = dataNascimentoEspecialista;
	}

	public char getGeneroEspecialista() {
		return generoEspecialista;
	}

	public void setGeneroEspecialista(char generoEspecialista) {
		this.generoEspecialista = generoEspecialista;
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

	public String getTelefoneEspecialista() {
		return telefoneEspecialista;
	}

	public void setTelefoneEspecialista(String telefoneEspecialista) {
		this.telefoneEspecialista = telefoneEspecialista;
	}

	public Disciplina getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}

	public Area getArea() {
		return area;
	}

	public void setArea(Area area) {
		this.area = area;
	}
}