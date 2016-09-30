package br.com.educ.model;

import java.util.Date;

public class Coordenador {

	private int idCoordenador;
	private String nomeCoordenador;
	private String rgCoordenador;
	private String cpfCoordenador;
	private Date dataNascimentoCoordenador;
	private char generoCoordenador;
	private String email;
	private String senha;
	private String telefoneCoordenador;
	private byte[] fotoCoordenador;

	public int getIdCoordenador() {
		return idCoordenador;
	}

	public void setIdCoordenador(int idCoordenador) {
		this.idCoordenador = idCoordenador;
	}

	public String getNomeCoordenador() {
		return nomeCoordenador;
	}

	public void setNomeCoordenador(String nomeCoordenador) {
		this.nomeCoordenador = nomeCoordenador;
	}

	public String getRgCoordenador() {
		return rgCoordenador;
	}

	public void setRgCoordenador(String rgCoordenador) {
		this.rgCoordenador = rgCoordenador;
	}

	public String getCpfCoordenador() {
		return cpfCoordenador;
	}

	public void setCpfCoordenador(String cpfCoordenador) {
		this.cpfCoordenador = cpfCoordenador;
	}

	public Date getDataNascimentoCoordenador() {
		return dataNascimentoCoordenador;
	}

	public void setDataNascimentoCoordenador(Date dataNascimentoCoordenador) {
		this.dataNascimentoCoordenador = dataNascimentoCoordenador;
	}

	public char getGeneroCoordenador() {
		return generoCoordenador;
	}

	public void setGeneroCoordenador(char generoCoordenador) {
		this.generoCoordenador = generoCoordenador;
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

	public String getTelefoneCoordenador() {
		return telefoneCoordenador;
	}

	public void setTelefoneCoordenador(String telefoneCoordenador) {
		this.telefoneCoordenador = telefoneCoordenador;
	}

	public byte[] getFotoCoordenador() {
		return fotoCoordenador;
	}

	public void setFotoCoordenador(byte[] fotoCoordenador) {
		this.fotoCoordenador = fotoCoordenador;
	}
}