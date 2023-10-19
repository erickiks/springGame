package com.senai.erick.PrjGame.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="db_game")
public class Jogo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idJogo;
	
	private String name;
	
	private String plataform ;
	
	public Jogo() {
		
	}

	public Jogo(Long idJogo, String name, String plataform) {
		super();
		this.idJogo = idJogo;
		this.name = name;
		this.plataform = plataform;
	}

	public Long getId() {
		return idJogo;
	}

	public void setId(Long idJogo) {
		this.idJogo = idJogo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPlataform() {
		return plataform;
	}

	public void setPlataform(String plataform) {
		this.plataform = plataform;
	}

}
