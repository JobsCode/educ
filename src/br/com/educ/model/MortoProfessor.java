package br.com.educ.model;

import java.util.Date;

public class MortoProfessor {

	private int idMortoProfessor;
	private String nomeMortoProfessor;
	private String rgMortoProfessor;
	private String cpfMortoProfessor;
	private char generoMortoProfessor;
	private Date dataNascimentoMortoProfessor;
	private String emailMortoProfessor;
	private String senhaMortoProfessor;
	private String telefoneMortoProfessor;
	private Date dataFimMortoProfessor;

	public int getIdMortoProfessor() {
		return idMortoProfessor;
	}

	public void setIdMortoProfessor(int idMortoProfessor) {
		this.idMortoProfessor = idMortoProfessor;
	}

	public String getNomeMortoProfessor() {
		return nomeMortoProfessor;
	}

	public void setNomeMortoProfessor(String nomeMortoProfessor) {
		this.nomeMortoProfessor = nomeMortoProfessor;
	}

	public String getRgMortoProfessor() {
		return rgMortoProfessor;
	}

	public void setRgMortoProfessor(String rgMortoProfessor) {
		this.rgMortoProfessor = rgMortoProfessor;
	}

	public String getCpfMortoProfessor() {
		return cpfMortoProfessor;
	}

	public void setCpfMortoProfessor(String cpfMortoProfessor) {
		this.cpfMortoProfessor = cpfMortoProfessor;
	}

	public char getGeneroMortoProfessor() {
		return generoMortoProfessor;
	}

	public void setGeneroMortoProfessor(char generoMortoProfessor) {
		this.generoMortoProfessor = generoMortoProfessor;
	}

	public Date getDataNascimentoMortoProfessor() {
		return dataNascimentoMortoProfessor;
	}

	public void setDataNascimentoMortoProfessor(
			Date dataNascimentoMortoProfessor) {
		this.dataNascimentoMortoProfessor = dataNascimentoMortoProfessor;
	}

	public String getEmailMortoProfessor() {
		return emailMortoProfessor;
	}

	public void setEmailMortoProfessor(String emailMortoProfessor) {
		this.emailMortoProfessor = emailMortoProfessor;
	}

	public String getSenhaMortoProfessor() {
		return senhaMortoProfessor;
	}

	public void setSenhaMortoProfessor(String senhaMortoProfessor) {
		this.senhaMortoProfessor = senhaMortoProfessor;
	}

	public String getTelefoneMortoProfessor() {
		return telefoneMortoProfessor;
	}

	public void setTelefoneMortoProfessor(String telefoneMortoProfessor) {
		this.telefoneMortoProfessor = telefoneMortoProfessor;
	}

	public Date getDataFimMortoProfessor() {
		return dataFimMortoProfessor;
	}

	public void setDataFimMortoProfessor(Date dataFimMortoProfessor) {
		this.dataFimMortoProfessor = dataFimMortoProfessor;
	}
}