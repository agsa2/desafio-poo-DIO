package com.dasafio.dominio;

public abstract class Conteudos {

	protected static final double XP_PADRAO = 10d;
	
	private String titulo;
	private String descricao;
	
	public abstract double calcularXp();
	
	
	
}
