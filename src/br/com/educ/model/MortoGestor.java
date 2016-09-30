package br.com.educ.model;

import java.util.Date;

public class MortoGestor {

	private int idMortoGestor;
	private String nomeMortoGestor;
	private String rgMortoGestor;
	private String cpfMortoGestor;
	private char generoMortoGestor;
	private Date dataNascimentoMortoGestor;
	private String emailMortoGestor;
	private String senhaMortoGestor;
	private Date dataFimMortoGestor;

	public int getIdMortoGestor() {
		return idMortoGestor;
	}

	public void setIdMortoGestor(int idMortoGestor) {
		this.idMortoGestor = idMortoGestor;
	}

	public String getNomeMortoGestor() {
		return nomeMortoGestor;
	}

	public void setNomeMortoGestor(String nomeMortoGestor) {
		this.nomeMortoGestor = nomeMortoGestor;
	}

	public String getRgMortoGestor() {
		return rgMortoGestor;
	}

	public void setRgMortoGestor(String rgMortoGestor) {
		this.rgMortoGestor = rgMortoGestor;
	}

	public String getCpfMortoGestor() {
		return cpfMortoGestor;
	}

	public void setCpfMortoGestor(String cpfMortoGestor) {
		this.cpfMortoGestor = cpfMortoGestor;
	}

	public char getGeneroMortoGestor() {
		return generoMortoGestor;
	}

	public void setGeneroMortoGestor(char generoMortoGestor) {
		this.generoMortoGestor = generoMortoGestor;
	}

	public Date getDataNascimentoMortoGestor() {
		return dataNascimentoMortoGestor;
	}

	public void setDataNascimentoMortoGestor(Date dataNascimentoMortoGestor) {
		this.dataNascimentoMortoGestor = dataNascimentoMortoGestor;
	}

	public String getEmailMortoGestor() {
		return emailMortoGestor;
	}

	public void setEmailMortoGestor(String emailMortoGestor) {
		this.emailMortoGestor = emailMortoGestor;
	}

	public String getSenhaMortoGestor() {
		return senhaMortoGestor;
	}

	public void setSenhaMortoGestor(String senhaMortoGestor) {
		this.senhaMortoGestor = senhaMortoGestor;
	}

	public Date getDataFimMortoGestor() {
		return dataFimMortoGestor;
	}

	public void setDataFimMortoGestor(Date dataFimMortoGestor) {
		this.dataFimMortoGestor = dataFimMortoGestor;
	}
}