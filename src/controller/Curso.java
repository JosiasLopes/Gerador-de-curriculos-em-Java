package controller;

public class Curso {
	String instituicao,curso;
	
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

	public Curso(String instituicao, String curso) {
		
		this.instituicao = instituicao;
		this.curso = curso;
	}
	
	public String toString(){
		return "Instituição: "+this.getInstituicao()+" Curso: "+this.getCurso();
	}
	
	
}
