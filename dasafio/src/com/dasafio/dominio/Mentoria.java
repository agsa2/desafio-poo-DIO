package com.dasafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudos {

	private LocalDate data;
	
	public Mentoria() {}
	
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}

	
	@Override
	public String toString() {
		
		String retorno = "\n";
		retorno += "Mentoria[\ntitulo = " + getTitulo() +
					",\ndescrição = "     + getDescricao() +
					",\ndata = "          + data + "]\n";
		return retorno;
	}

	@Override
	public double calcularXp() {
		return XP_PADRAO + 20d;
	}
	
	
	
	
	
	
	
}
