package com.dasafio.dominio;



public class Cursos extends Conteudos{

	private int    cargaHoraria;
	
	public Cursos() {}

	public int getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	
	@Override
	public String toString() {
		
		String retorno = "\n";
		retorno += "Curso[\ntitulo = "   + getTitulo() +
					",\ndescrição = "     + getDescricao() +
					",\nCarga Horaria = " + getCargaHoraria() + "]\n";
		return retorno;
	}

	@Override
	public double calcularXp() {
		return XP_PADRAO * cargaHoraria;
	}
	
	
	
	
}
