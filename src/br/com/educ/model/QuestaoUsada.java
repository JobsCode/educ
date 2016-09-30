package br.com.educ.model;

public class QuestaoUsada {

	private int idQuestaoUsada;
	private short dificuldadeQuestaoUsada;
	private String enunciadoQuestaoUsada;
	private QuestaoObjetiva questaoObjetiva;
	private Disciplina disciplina;
	private Alternativa alternativa;
	private String assuntoQuestaoUsada;
	private String respostaQuestaoUsada;

	public int getIdQuestaoUsada() {
		return idQuestaoUsada;
	}

	public void setIdQuestaoUsada(int idQuestaoUsada) {
		this.idQuestaoUsada = idQuestaoUsada;
	}

	public short getDificuldadeQuestaoUsada() {
		return dificuldadeQuestaoUsada;
	}

	public void setDificuldadeQuestaoUsada(short dificuldadeQuestaoUsada) {
		this.dificuldadeQuestaoUsada = dificuldadeQuestaoUsada;
	}

	public String getEnunciadoQuestaoUsada() {
		return enunciadoQuestaoUsada;
	}

	public void setEnunciadoQuestaoUsada(String enunciadoQuestaoUsada) {
		this.enunciadoQuestaoUsada = enunciadoQuestaoUsada;
	}

	public QuestaoObjetiva getQuestaoObjetiva() {
		return questaoObjetiva;
	}

	public void setQuestaoObjetiva(QuestaoObjetiva questaoObjetiva) {
		this.questaoObjetiva = questaoObjetiva;
	}

	public Disciplina getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}

	public Alternativa getAlternativa() {
		return alternativa;
	}

	public void setAlternativa(Alternativa alternativa) {
		this.alternativa = alternativa;
	}

	public String getAssuntoQuestaoUsada() {
		return assuntoQuestaoUsada;
	}

	public void setAssuntoQuestaoUsada(String assuntoQuestaoUsada) {
		this.assuntoQuestaoUsada = assuntoQuestaoUsada;
	}

	public String getRespostaQuestaoUsada() {
		return respostaQuestaoUsada;
	}

	public void setRespostaQuestaoUsada(String respostaQuestaoUsada) {
		this.respostaQuestaoUsada = respostaQuestaoUsada;
	}
}