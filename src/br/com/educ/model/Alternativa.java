package br.com.educ.model;

public class Alternativa {

	private int idAlternativa;
	private QuestaoObjetiva questaoObjetiva;
	private String respostaAlternativa;
	private String respostaTextoAlternativa;
	private byte[] respostaFotoAlternativa;
	private Escola escola;
	private Professor professor;

	public int getIdAlternativa() {
		return idAlternativa;
	}

	public void setIdAlternativa(int idAlternativa) {
		this.idAlternativa = idAlternativa;
	}

	public QuestaoObjetiva getQuestaoObjetiva() {
		return questaoObjetiva;
	}

	public void setQuestaoObjetiva(QuestaoObjetiva questaoObjetiva) {
		this.questaoObjetiva = questaoObjetiva;
	}

	public String getRespostaAlternativa() {
		return respostaAlternativa;
	}

	public void setRespostaAlternativa(String respostaAlternativa) {
		this.respostaAlternativa = respostaAlternativa;
	}

	public String getRespostaTextoAlternativa() {
		return respostaTextoAlternativa;
	}

	public void setRespostaTextoAlternativa(String respostaTextoAlternativa) {
		this.respostaTextoAlternativa = respostaTextoAlternativa;
	}

	public byte[] getRespostaFotoAlternativa() {
		return respostaFotoAlternativa;
	}

	public void setRespostaFotoAlternativa(byte[] respostaFotoAlternativa) {
		this.respostaFotoAlternativa = respostaFotoAlternativa;
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
}