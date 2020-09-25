package controller;

public class Pessoa {
	
	private String nome, escivil,idade,telefone,rua,baiiro,cidade,estado,cep;

	public Pessoa(String nome, String escivil, String idade, String telefone, String rua, String baiiro, String cidade,
			String estado, String cep) {
		this.nome = nome;
		this.escivil = escivil;
		this.idade = idade;
		this.telefone = telefone;
		this.rua = rua;
		this.baiiro = baiiro;
		this.cidade = cidade;
		this.estado = estado;
		this.cep = cep;
	}
	
	public Pessoa(){
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEscivil() {
		return escivil;
	}

	public void setEscivil(String escivil) {
		this.escivil = escivil;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getBaiiro() {
		return baiiro;
	}

	public void setBaiiro(String baiiro) {
		this.baiiro = baiiro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}
	
	
	
	

}
