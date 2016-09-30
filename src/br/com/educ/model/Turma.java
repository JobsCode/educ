package br.com.educ.model;

import java.util.Date;

public class Turma {
	
	private int idTurma;
	private String identificacaoTurma;
	private Date dataInicioTurma;
	private Date dataFimTurma;
	private char periodoTurma;
	private Escola escola;

	public int getIdTurma() {
		return idTurma;
	}

	public void setIdTurma(int idTurma) {
		this.idTurma = idTurma;
	}

	public String getIdentificacaoTurma() {
		return identificacaoTurma;
	}

	public void setIdentificacaoTurma(String identificacaoTurma) {
		this.identificacaoTurma = identificacaoTurma;
	}

	public Date getDataInicioTurma() {
		return dataInicioTurma;
	}

	public void setDataInicioTurma(Date dataInicioTurma) {
		this.dataInicioTurma = dataInicioTurma;
	}

	public Date getDataFimTurma() {
		return dataFimTurma;
	}

	public void setDataFimTurma(Date dataFimTurma) {
		this.dataFimTurma = dataFimTurma;
	}

	public char getPeriodoTurma() {
		return periodoTurma;
	}

	public void setPeriodoTurma(char periodoTurma) {
		this.periodoTurma = periodoTurma;
	}

	public Escola getEscola() {
		return escola;
	}

	public void setEscola(Escola escola) {
		this.escola = escola;
	}
}