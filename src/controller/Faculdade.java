package controller;

public class Faculdade {
	String instituicao,curso,conclusao;

	public String getInstituicao() {
		return instituicao;
	}

	public void setInstituicao(String instituicao) {
		this.instituicao = instituicao;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getConclusao() {
		return conclusao;
	}

	public void setConclusao(String conclusao) {
		this.conclusao = conclusao;
	}

	public Faculdade(String instituicao, String curso, String conclusao) {
		this.instituicao = instituicao;
		this.curso = curso;
		this.conclusao = conclusao;
	}
	
	public Faculdade(){
		
	}
	
	public String toString(){
		return "Instituição: "+this.getInstituicao()+" Curso: "+this.getCurso()+" Concluido: "+this.getConclusao();
	}
	
}
