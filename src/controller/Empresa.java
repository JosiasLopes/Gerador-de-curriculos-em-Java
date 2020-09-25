package controller;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Empresa {
	private String empresa, cargo;
	private Date entrada, saida;
	
	public Empresa(String empresa, String cargo, Date entrada, Date saida) {
		this.empresa = empresa;
		this.cargo = cargo;
		this.entrada = entrada;
		this.saida = saida;
	}
	
	public Empresa(){
		
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public Date getEntrada() {
		return entrada;
	}

	public void setEntrada(Date entrada) {
		this.entrada = entrada;
	}

	public Date getSaida() {
		return saida;
	}

	public void setSaida(Date saida) {
		this.saida = saida;
	}
	
	public String toString(){
		SimpleDateFormat sp = new SimpleDateFormat("dd/MM/yyyy");
		String entra = sp.format(getEntrada());
		String saida = sp.format(this.getSaida());
		return "Empresa: "+this.getEmpresa()+" Cargo: "+this.getCargo()+" Data inicial: "+entra+" Data de Saida: "+saida;
	}
	
	

}
