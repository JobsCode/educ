package br.com.educ.model;

import java.util.Date;

public class Aluno {

	private int idAluno;
	private String nomeAluno;
	private String rgAluno;
	private String cpfAluno;
	private Date dataNascimentoAluno;
	private char generoAluno;
	private String email;
	private String senha;
	private String telefoneAluno;
	private Escola escola;
	private Turma turma;

	public int getIdAluno() {
		return idAluno;
	}

	public void setIdAluno(int idAluno) {
		this.idAluno = idAluno;
	}

	public String getNomeAluno() {
		return nomeAluno;
	}

	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}

	public String getRgAluno() {
		return rgAluno;
	}

	public void setRgAluno(String rgAluno) {
		this.rgAluno = rgAluno;
	}

	public String getCpfAluno() {
		return cpfAluno;
	}

	public void setCpfAluno(String cpfAluno) {
		this.cpfAluno = cpfAluno;
	}

	public Date getDataNascimentoAluno() {
		return dataNascimentoAluno;
	}

	public void setDataNascimentoAluno(Date dataNascimentoAluno) {
		this.dataNascimentoAluno = dataNascimentoAluno;
	}

	public char getGeneroAluno() {
		return generoAluno;
	}

	public void setGeneroAluno(char generoAluno) {
		this.generoAluno = generoAluno;
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

	public String getTelefoneAluno() {
		return telefoneAluno;
	}

	public void setTelefoneAluno(String telefoneAluno) {
		this.telefoneAluno = telefoneAluno;
	}

	public Escola getEscola() {
		return escola;
	}

	public void setEscola(Escola escola) {
		this.escola = escola;
	}

	public Turma getTurma() {
		return turma;
	}

	public void setTurma(Turma turma) {
		this.turma = turma;
	}
}