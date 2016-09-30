package br.com.educ.model;

import java.util.Date;

public class Prova {

	private int idProva;
	private String respostaProva;
	private double valorQuestaoProva;
	private String visualizacaoProva;
	private char formaGerarProva;
	private Disciplina disciplina;
	private Turma turma;
	private int qntUsoProva;
	private QuestaoObjetiva questaoObjetiva;
	private QuestaoDissertativa questaoDissertativa;
	private char tipoQuestoesProva;
	private short dificuldadeProva;
	private String identificacaoProva;
	private Aluno aluno;
	private Escola escola;
	private String cpfAlunoProva;
	private Professor professor;
	private Alternativa alternativa;
	private Date periodoDisponivelProva;
	private double notaProva;
	private Date inativoQuestaoProva;
	private int numeroQuestaoProva;

	public int getIdProva() {
		return idProva;
	}

	public void setIdProva(int idProva) {
		this.idProva = idProva;
	}

	public String getRespostaProva() {
		return respostaProva;
	}

	public void setRespostaProva(String respostaProva) {
		this.respostaProva = respostaProva;
	}

	public double getValorQuestaoProva() {
		return valorQuestaoProva;
	}

	public void setValorQuestaoProva(double valorQuestaoProva) {
		this.valorQuestaoProva = valorQuestaoProva;
	}

	public String getVisualizacaoProva() {
		return visualizacaoProva;
	}

	public void setVisualizacaoProva(String visualizacaoProva) {
		this.visualizacaoProva = visualizacaoProva;
	}

	public char getFormaGerarProva() {
		return formaGerarProva;
	}

	public void setFormaGerarProva(char formaGerarProva) {
		this.formaGerarProva = formaGerarProva;
	}

	public Disciplina getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}

	public Turma getTurma() {
		return turma;
	}

	public void setTurma(Turma turma) {
		this.turma = turma;
	}

	public int getQntUsoProva() {
		return qntUsoProva;
	}

	public void setQntUsoProva(int qntUsoProva) {
		this.qntUsoProva = qntUsoProva;
	}

	public QuestaoObjetiva getQuestaoObjetiva() {
		return questaoObjetiva;
	}

	public void setQuestaoObjetiva(QuestaoObjetiva questaoObjetiva) {
		this.questaoObjetiva = questaoObjetiva;
	}

	public QuestaoDissertativa getQuestaoDissertativa() {
		return questaoDissertativa;
	}

	public void setQuestaoDissertativa(QuestaoDissertativa questaoDissertativa) {
		this.questaoDissertativa = questaoDissertativa;
	}

	public char getTipoQuestoesProva() {
		return tipoQuestoesProva;
	}

	public void setTipoQuestoesProva(char tipoQuestoesProva) {
		this.tipoQuestoesProva = tipoQuestoesProva;
	}

	public short getDificuldadeProva() {
		return dificuldadeProva;
	}

	public void setDificuldadeProva(short dificuldadeProva) {
		this.dificuldadeProva = dificuldadeProva;
	}

	public String getIdentificacaoProva() {
		return identificacaoProva;
	}

	public void setIdentificacaoProva(String identificacaoProva) {
		this.identificacaoProva = identificacaoProva;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public Escola getEscola() {
		return escola;
	}

	public void setEscola(Escola escola) {
		this.escola = escola;
	}

	public String getCpfAlunoProva() {
		return cpfAlunoProva;
	}

	public void setCpfAlunoProva(String cpfAlunoProva) {
		this.cpfAlunoProva = cpfAlunoProva;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public Alternativa getAlternativa() {
		return alternativa;
	}

	public void setAlternativa(Alternativa alternativa) {
		this.alternativa = alternativa;
	}

	public Date getPeriodoDisponivelProva() {
		return periodoDisponivelProva;
	}

	public void setPeriodoDisponivelProva(Date periodoDisponivelProva) {
		this.periodoDisponivelProva = periodoDisponivelProva;
	}

	public double getNotaProva() {
		return notaProva;
	}

	public void setNotaProva(double notaProva) {
		this.notaProva = notaProva;
	}

	public Date getInativoQuestaoProva() {
		return inativoQuestaoProva;
	}

	public void setInativoQuestaoProva(Date inativoQuestaoProva) {
		this.inativoQuestaoProva = inativoQuestaoProva;
	}

	public int getNumeroQuestaoProva() {
		return numeroQuestaoProva;
	}

	public void setNumeroQuestaoProva(int numeroQuestaoProva) {
		this.numeroQuestaoProva = numeroQuestaoProva;
	}
}