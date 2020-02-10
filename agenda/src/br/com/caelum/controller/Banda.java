package br.com.caelum.controller;

<<<<<<< HEAD
import java.util.Date;
=======
import java.util.Calendar;
>>>>>>> 2334c34467932a3ff45ff03329876f5f681e6c7d

public class Banda {
	
	public String getNomeBanda() {
		return nomeBanda;
	}
	public void setNomeBanda(String nomeBanda) {
		this.nomeBanda = nomeBanda;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
<<<<<<< HEAD
	public String getLugar() {
		return lugar;
	}
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}
	public String getCapacidade() {
		return capacidade;
	}
	public void setCapacidade(String capacidade) {
		this.capacidade = capacidade;
	}
	public String getDataShow() {
		return dataShow;
	}
	public void setDataShow(String dataShow) {
=======
	public String getNomeLocal() {
		return nomeLocal;
	}
	public void setNomeLocal(String nomeLocal) {
		this.nomeLocal = nomeLocal;
	}
	public int getCapacidade() {
		return capacidade;
	}
	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}
	public Calendar getDataShow() {
		return dataShow;
	}
	public void setDataShow(Calendar dataShow) {
>>>>>>> 2334c34467932a3ff45ff03329876f5f681e6c7d
		this.dataShow = dataShow;
	}
	
	String nomeBanda;
	String genero;
<<<<<<< HEAD
	String lugar;
	String capacidade;
	String dataShow;
=======
	String nomeLocal;
	int capacidade;
	Calendar dataShow;
>>>>>>> 2334c34467932a3ff45ff03329876f5f681e6c7d
}
