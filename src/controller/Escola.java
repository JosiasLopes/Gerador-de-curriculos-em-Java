package controller;

public class Escola {
	String instituicao,conclusao;

	public String getInstituicao() {
		return instituicao;
	}

	public void setInstituicao(String instituicao) {
		this.instituicao = instituicao;
	}

	

	public String getConclusao() {
		return conclusao;
	}

	public void setConclusao(String conclusao) {
		this.conclusao = conclusao;
	}

	
	public String toString(){
		return "Instituição: "+this.getInstituicao()+" Concluido: "+this.getConclusao();
	}
	
	public Escola(){
		
	}

	public Escola(String instituicao, String conclusao) {
		this.instituicao = instituicao;
		this.conclusao = conclusao;
	}
	
	

	
	
}
