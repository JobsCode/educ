package br.com.educ.model;

import java.util.Date;

public class MortoTurma {

	private int idMortoTurma;
	private String identificacaoMortoTurma;
	private Date dataInicioMortoTurma;
	private Date dataFimMortoTurma;
	private char periodoMortoTurma;

	public int getIdMortoTurma() {
		return idMortoTurma;
	}

	public void setIdMortoTurma(int idMortoTurma) {
		this.idMortoTurma = idMortoTurma;
	}

	public String getIdentificacaoMortoTurma() {
		return identificacaoMortoTurma;
	}

	public void setIdentificacaoMortoTurma(String identificacaoMortoTurma) {
		this.identificacaoMortoTurma = identificacaoMortoTurma;
	}

	public Date getDataInicioMortoTurma() {
		return dataInicioMortoTurma;
	}

	public void setDataInicioMortoTurma(Date dataInicioMortoTurma) {
		this.dataInicioMortoTurma = dataInicioMortoTurma;
	}

	public Date getDataFimMortoTurma() {
		return dataFimMortoTurma;
	}

	public void setDataFimMortoTurma(Date dataFimMortoTurma) {
		this.dataFimMortoTurma = dataFimMortoTurma;
	}

	public char getPeriodoMortoTurma() {
		return periodoMortoTurma;
	}

	public void setPeriodoMortoTurma(char periodoMortoTurma) {
		this.periodoMortoTurma = periodoMortoTurma;
	}
}