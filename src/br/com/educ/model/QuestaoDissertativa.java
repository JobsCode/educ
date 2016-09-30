package br.com.educ.model;

public class QuestaoDissertativa {

	private int idQuestaoDissertativa;
	private String comentarioQuestaoDissertativa;
	private String enunciadoTextoQuestaoDissertativa;
	private byte[] enunciadoFotoQuestaoDissertativa;
	private String identificacaoQuestaoDissertativa;
	private String visualizacaoQuestaoDissertativa;
	private String validacaoQuestaoDissertativa;
	private Area area;
	private Disciplina disciplina;
	private String assuntoQuestaoDissertativa;
	private int qtdUsoQuestaoDissertativa;
	private short dificuldadeQuestaoDissertativa;
	private double valorQuestaoDissertativa;

	public int getIdQuestaoDissertativa() {
		return idQuestaoDissertativa;
	}

	public void setIdQuestaoDissertativa(int idQuestaoDissertativa) {
		this.idQuestaoDissertativa = idQuestaoDissertativa;
	}

	public String getComentarioQuestaoDissertativa() {
		return comentarioQuestaoDissertativa;
	}

	public void setComentarioQuestaoDissertativa(
			String comentarioQuestaoDissertativa) {
		this.comentarioQuestaoDissertativa = comentarioQuestaoDissertativa;
	}

	public String getEnunciadoTextoQuestaoDissertativa() {
		return enunciadoTextoQuestaoDissertativa;
	}

	public void setEnunciadoTextoQuestaoDissertativa(
			String enunciadoTextoQuestaoDissertativa) {
		this.enunciadoTextoQuestaoDissertativa = enunciadoTextoQuestaoDissertativa;
	}

	public byte[] getEnunciadoFotoQuestaoDissertativa() {
		return enunciadoFotoQuestaoDissertativa;
	}

	public void setEnunciadoFotoQuestaoDissertativa(
			byte[] enunciadoFotoQuestaoDissertativa) {
		this.enunciadoFotoQuestaoDissertativa = enunciadoFotoQuestaoDissertativa;
	}

	public String getIdentificacaoQuestaoDissertativa() {
		return identificacaoQuestaoDissertativa;
	}

	public void setIdentificacaoQuestaoDissertativa(
			String identificacaoQuestaoDissertativa) {
		this.identificacaoQuestaoDissertativa = identificacaoQuestaoDissertativa;
	}

	public String getVisualizacaoQuestaoDissertativa() {
		return visualizacaoQuestaoDissertativa;
	}

	public void setVisualizacaoQuestaoDissertativa(
			String visualizacaoQuestaoDissertativa) {
		this.visualizacaoQuestaoDissertativa = visualizacaoQuestaoDissertativa;
	}

	public String getValidacaoQuestaoDissertativa() {
		return validacaoQuestaoDissertativa;
	}

	public void setValidacaoQuestaoDissertativa(
			String validacaoQuestaoDissertativa) {
		this.validacaoQuestaoDissertativa = validacaoQuestaoDissertativa;
	}

	public Area getArea() {
		return area;
	}

	public void setArea(Area area) {
		this.area = area;
	}

	public Disciplina getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}

	public String getAssuntoQuestaoDissertativa() {
		return assuntoQuestaoDissertativa;
	}

	public void setAssuntoQuestaoDissertativa(String assuntoQuestaoDissertativa) {
		this.assuntoQuestaoDissertativa = assuntoQuestaoDissertativa;
	}

	public int getQtdUsoQuestaoDissertativa() {
		return qtdUsoQuestaoDissertativa;
	}

	public void setQtdUsoQuestaoDissertativa(int qtdUsoQuestaoDissertativa) {
		this.qtdUsoQuestaoDissertativa = qtdUsoQuestaoDissertativa;
	}

	public short getDificuldadeQuestaoDissertativa() {
		return dificuldadeQuestaoDissertativa;
	}

	public void setDificuldadeQuestaoDissertativa(
			short dificuldadeQuestaoDissertativa) {
		this.dificuldadeQuestaoDissertativa = dificuldadeQuestaoDissertativa;
	}

	public double getValorQuestaoDissertativa() {
		return valorQuestaoDissertativa;
	}

	public void setValorQuestaoDissertativa(double valorQuestaoDissertativa) {
		this.valorQuestaoDissertativa = valorQuestaoDissertativa;
	}
}