package br.com.educ.model;

import java.util.Date;

public class MortoAluno {

	private int idMortoAluno;
	private String nomeMortoAluno;
	private String rgMortoAluno;
	private String cpfMortoAluno;
	private char generoMortoAluno;
	private Date dataNascimentoMortoAluno;
	private String emailMortoAluno;
	private String senhaMortoAluno;
	private String telefoneMortoAluno;
	private Date dataFimMortoAluno;

	public int getIdMortoAluno() {
		return idMortoAluno;
	}

	public void setIdMortoAluno(int idMortoAluno) {
		this.idMortoAluno = idMortoAluno;
	}

	public String getNomeMortoAluno() {
		return nomeMortoAluno;
	}

	public void setNomeMortoAluno(String nomeMortoAluno) {
		this.nomeMortoAluno = nomeMortoAluno;
	}

	public String getRgMortoAluno() {
		return rgMortoAluno;
	}

	public void setRgMortoAluno(String rgMortoAluno) {
		this.rgMortoAluno = rgMortoAluno;
	}

	public String getCpfMortoAluno() {
		return cpfMortoAluno;
	}

	public void setCpfMortoAluno(String cpfMortoAluno) {
		this.cpfMortoAluno = cpfMortoAluno;
	}

	public char getGeneroMortoAluno() {
		return generoMortoAluno;
	}

	public void setGeneroMortoAluno(char generoMortoAluno) {
		this.generoMortoAluno = generoMortoAluno;
	}

	public Date getDataNascimentoMortoAluno() {
		return dataNascimentoMortoAluno;
	}

	public void setDataNascimentoMortoAluno(Date dataNascimentoMortoAluno) {
		this.dataNascimentoMortoAluno = dataNascimentoMortoAluno;
	}

	public String getEmailMortoAluno() {
		return emailMortoAluno;
	}

	public void setEmailMortoAluno(String emailMortoAluno) {
		this.emailMortoAluno = emailMortoAluno;
	}

	public String getSenhaMortoAluno() {
		return senhaMortoAluno;
	}

	public void setSenhaMortoAluno(String senhaMortoAluno) {
		this.senhaMortoAluno = senhaMortoAluno;
	}

	public String getTelefoneMortoAluno() {
		return telefoneMortoAluno;
	}

	public void setTelefoneMortoAluno(String telefoneMortoAluno) {
		this.telefoneMortoAluno = telefoneMortoAluno;
	}

	public Date getDataFimMortoAluno() {
		return dataFimMortoAluno;
	}

	public void setDataFimMortoAluno(Date dataFimMortoAluno) {
		this.dataFimMortoAluno = dataFimMortoAluno;
	}
}