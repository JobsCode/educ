package br.com.educ.model;

import java.util.Date;

public class MortoEscola {

	private int idMortoEscola;
	private String nomeMortoEscola;
	private String cnpjMortoEscola;
	private Date dataFimMortoAluno;

	public int getIdMortoEscola() {
		return idMortoEscola;
	}

	public void setIdMortoEscola(int idMortoEscola) {
		this.idMortoEscola = idMortoEscola;
	}

	public String getNomeMortoEscola() {
		return nomeMortoEscola;
	}

	public void setNomeMortoEscola(String nomeMortoEscola) {
		this.nomeMortoEscola = nomeMortoEscola;
	}

	public String getCnpjMortoEscola() {
		return cnpjMortoEscola;
	}

	public void setCnpjMortoEscola(String cnpjMortoEscola) {
		this.cnpjMortoEscola = cnpjMortoEscola;
	}

	public Date getDataFimMortoAluno() {
		return dataFimMortoAluno;
	}

	public void setDataFimMortoAluno(Date dataFimMortoAluno) {
		this.dataFimMortoAluno = dataFimMortoAluno;
	}
}