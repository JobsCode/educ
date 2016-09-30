package br.com.educ.model;

public class QuestaoObjetiva {

	private int idQuestaoObjetiva;
	private String comentarioQuestaoObjetiva;
	private byte[] enunciadoFotoQuestaoObjetiva;
	private String enunciadoTextoQuestaoObjetiva;
	private String identificacaoQuestaoObjetiva;
	private String validacaoQuestaoObjetiva;
	private Area area;
	private Disciplina disciplina;
	private Escola escola;
	private Professor professor;
	private String assuntoQuestaoObjetiva;
	private int qtdUsoQuestaoObjetiva;
	private short dificuldadeQuestaoObjetiva;
	private String acertoQuestaoObjetiva;
	private double resultadoQuestaoObjetiva;

	public int getIdQuestaoObjetiva() {
		return idQuestaoObjetiva;
	}

	public void setIdQuestaoObjetiva(int idQuestaoObjetiva) {
		this.idQuestaoObjetiva = idQuestaoObjetiva;
	}

	public String getComentarioQuestaoObjetiva() {
		return comentarioQuestaoObjetiva;
	}

	public void setComentarioQuestaoObjetiva(String comentarioQuestaoObjetiva) {
		this.comentarioQuestaoObjetiva = comentarioQuestaoObjetiva;
	}

	public byte[] getEnunciadoFotoQuestaoObjetiva() {
		return enunciadoFotoQuestaoObjetiva;
	}

	public void setEnunciadoFotoQuestaoObjetiva(
			byte[] enunciadoFotoQuestaoObjetiva) {
		this.enunciadoFotoQuestaoObjetiva = enunciadoFotoQuestaoObjetiva;
	}

	public String getEnunciadoTextoQuestaoObjetiva() {
		return enunciadoTextoQuestaoObjetiva;
	}

	public void setEnunciadoTextoQuestaoObjetiva(
			String enunciadoTextoQuestaoObjetiva) {
		this.enunciadoTextoQuestaoObjetiva = enunciadoTextoQuestaoObjetiva;
	}

	public String getIdentificacaoQuestaoObjetiva() {
		return identificacaoQuestaoObjetiva;
	}

	public void setIdentificacaoQuestaoObjetiva(
			String identificacaoQuestaoObjetiva) {
		this.identificacaoQuestaoObjetiva = identificacaoQuestaoObjetiva;
	}

	public String getValidacaoQuestaoObjetiva() {
		return validacaoQuestaoObjetiva;
	}

	public void setValidacaoQuestaoObjetiva(String validacaoQuestaoObjetiva) {
		this.validacaoQuestaoObjetiva = validacaoQuestaoObjetiva;
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

	public Escola getEscola() {
		return escola;
	}

	public void setEscola(Escola escola) {
		this.escola = escola;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public String getAssuntoQuestaoObjetiva() {
		return assuntoQuestaoObjetiva;
	}

	public void setAssuntoQuestaoObjetiva(String assuntoQuestaoObjetiva) {
		this.assuntoQuestaoObjetiva = assuntoQuestaoObjetiva;
	}

	public int getQtdUsoQuestaoObjetiva() {
		return qtdUsoQuestaoObjetiva;
	}

	public void setQtdUsoQuestaoObjetiva(int qtdUsoQuestaoObjetiva) {
		this.qtdUsoQuestaoObjetiva = qtdUsoQuestaoObjetiva;
	}

	public short getDificuldadeQuestaoObjetiva() {
		return dificuldadeQuestaoObjetiva;
	}

	public void setDificuldadeQuestaoObjetiva(short dificuldadeQuestaoObjetiva) {
		this.dificuldadeQuestaoObjetiva = dificuldadeQuestaoObjetiva;
	}

	public String getAcertoQuestaoObjetiva() {
		return acertoQuestaoObjetiva;
	}

	public void setAcertoQuestaoObjetiva(String acertoQuestaoObjetiva) {
		this.acertoQuestaoObjetiva = acertoQuestaoObjetiva;
	}

	public double getResultadoQuestaoObjetiva() {
		return resultadoQuestaoObjetiva;
	}

	public void setResultadoQuestaoObjetiva(double resultadoQuestaoObjetiva) {
		this.resultadoQuestaoObjetiva = resultadoQuestaoObjetiva;
	}
}