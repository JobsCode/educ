package br.com.educ.model;

public class Disciplina {

	private int idDisciplina;
	private String nomeDisciplina;
	private String descricaoDisciplina;
	private Area area;

	public int getIdDisciplina() {
		return idDisciplina;
	}

	public void setIdDisciplina(int idDisciplina) {
		this.idDisciplina = idDisciplina;
	}

	public String getNomeDisciplina() {
		return nomeDisciplina;
	}

	public void setNomeDisciplina(String nomeDisciplina) {
		this.nomeDisciplina = nomeDisciplina;
	}

	public String getDescricaoDisciplina() {
		return descricaoDisciplina;
	}

	public void setDescricaoDisciplina(String descricaoDisciplina) {
		this.descricaoDisciplina = descricaoDisciplina;
	}

	public Area getArea() {
		return area;
	}

	public void setArea(Area area) {
		this.area = area;
	}
}