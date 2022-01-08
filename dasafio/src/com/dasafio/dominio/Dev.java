package com.dasafio.dominio;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

public class Dev {

	private String nome;
	private Set<Conteudos> conteudosInscritos = new LinkedHashSet<>();
	private Set<Conteudos> conteudosConcluidos = new LinkedHashSet<>();
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Set<Conteudos> getConteudosInscritos() {
		return conteudosInscritos;
	}
	public void setConteudosInscritos(Set<Conteudos> conteudosInscritos) {
		this.conteudosInscritos = conteudosInscritos;
	}
	public Set<Conteudos> getConteudosConcluidos() {
		return conteudosConcluidos;
	}
	public void setConteudosConcluidos(Set<Conteudos> conteudosConcluidos) {
		this.conteudosConcluidos = conteudosConcluidos;
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((conteudosConcluidos == null) ? 0 : conteudosConcluidos.hashCode());
		result = prime * result + ((conteudosInscritos == null) ? 0 : conteudosInscritos.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dev other = (Dev) obj;
		if (conteudosConcluidos == null) {
			if (other.conteudosConcluidos != null)
				return false;
		} else if (!conteudosConcluidos.equals(other.conteudosConcluidos))
			return false;
		if (conteudosInscritos == null) {
			if (other.conteudosInscritos != null)
				return false;
		} else if (!conteudosInscritos.equals(other.conteudosInscritos))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

	
	public void inscreverBootcamp(Bootcamp bootcamp) {
		this.conteudosInscritos.addAll(bootcamp.getConteudos());
		bootcamp.getDevsInscritos().add(this);
	};
	
	public void progredir() {
		Optional<Conteudos> conteudo = this.conteudosInscritos.stream().findFirst();
		if(conteudo.isPresent()) {
			this.conteudosConcluidos.add(conteudo.get());
			this.conteudosInscritos.remove(conteudo.get());
		}
		else {
			System.out.println("Você não tem conteudos matriculados");
		}
	}
	
	public Double calcularTotalXp() {
		return this.conteudosInscritos
				   .stream()
				   .mapToDouble(conteudo -> conteudo.calcularXp())
				   .sum();	
	}
	
	
	
	
	
}
