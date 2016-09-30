package br.com.educ.model;

public class Simulado {

	private int idSimulado;
	private String identificacaoSimulado;
	private int numeroQuestoesSimulado;
	private Professor professor;
	private QuestaoUsada questaoUsada;
	private Alternativa alternativa;
	private String visualizacaoSimulado;
	private short dificuldadeSimulado;
	private double notaSimulado;

	public int getIdSimulado() {
		return idSimulado;
	}

	public void setIdSimulado(int idSimulado) {
		this.idSimulado = idSimulado;
	}

	public String getIdentificacaoSimulado() {
		return identificacaoSimulado;
	}

	public void setIdentificacaoSimulado(String identificacaoSimulado) {
		this.identificacaoSimulado = identificacaoSimulado;
	}

	public int getNumeroQuestoesSimulado() {
		return numeroQuestoesSimulado;
	}

	public void setNumeroQuestoesSimulado(int numeroQuestoesSimulado) {
		this.numeroQuestoesSimulado = numeroQuestoesSimulado;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public QuestaoUsada getQuestaoUsada() {
		return questaoUsada;
	}

	public void setQuestaoUsada(QuestaoUsada questaoUsada) {
		this.questaoUsada = questaoUsada;
	}

	public Alternativa getAlternativa() {
		return alternativa;
	}

	public void setAlternativa(Alternativa alternativa) {
		this.alternativa = alternativa;
	}

	public String getVisualizacaoSimulado() {
		return visualizacaoSimulado;
	}

	public void setVisualizacaoSimulado(String visualizacaoSimulado) {
		this.visualizacaoSimulado = visualizacaoSimulado;
	}

	public short getDificuldadeSimulado() {
		return dificuldadeSimulado;
	}

	public void setDificuldadeSimulado(short dificuldadeSimulado) {
		this.dificuldadeSimulado = dificuldadeSimulado;
	}

	public double getNotaSimulado() {
		return notaSimulado;
	}

	public void setNotaSimulado(double notaSimulado) {
		this.notaSimulado = notaSimulado;
	}
}