package com.dasafio.dominio;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		Cursos curso1 = new Cursos();
		curso1.setTitulo("Java");
		curso1.setDescricao("Curso da linguagem Java");
		curso1.setCargaHoraria(8);
		
		Cursos curso2 = new Cursos();
		curso2.setTitulo("JS");
		curso2.setDescricao("Curso da linguagem JS");
		curso2.setCargaHoraria(12);
		
		Mentoria mentoria1 = new Mentoria();
		mentoria1.setTitulo("Mentoria de Java");
		mentoria1.setDescricao("Mentoria da linguagem Java");
		mentoria1.setData(LocalDate.now());
		
		/*System.out.println(curso1.calcularXp());
		System.out.println(mentoria1.calcularXp());
		System.out.println(curso2);*/

		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Desafio bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria1);
		
		Dev devAlavro = new Dev();
		devAlavro.setNome("Alvaro");
		devAlavro.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos inscritos Alvaro: "  + devAlavro.getConteudosInscritos());
		
		devAlavro.progredir();
		
		System.out.println("Conteudos inscritos Alvaro: "  + devAlavro.getConteudosInscritos());
		System.out.println("Conteudos concluidos Alvaro: " + devAlavro.getConteudosConcluidos());
		System.out.println("XP: " + devAlavro.calcularTotalXp());
		
		Dev devMaria = new Dev();
		devMaria.setNome("Maria");
		devMaria.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos inscritos Maria: "  + devMaria.getConteudosInscritos());
		
		devMaria.progredir();
		devMaria.progredir();
		
		System.out.println("Conteudos inscritos Maria: "  + devMaria.getConteudosInscritos());
		System.out.println("Conteudos concluidos Maria: " + devAlavro.getConteudosConcluidos());
		System.out.println("XP: " + devMaria.calcularTotalXp());

		
		
		
	}

}
