package com.DiegoG.JobApp.models;

import java.io.Serializable;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Vaga implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String nomeVaga;
	private String area;
	private String salario;
	private String modalidade;

	public Vaga() {

	}

	public Vaga(Long id, String nomeVaga, String area, String salario, String modalidade) {
		super();
		this.id = id;
		this.nomeVaga = nomeVaga;
		this.area = area;
		this.salario = salario;
		this.modalidade = modalidade;
	}

	public String getNomeVaga() {
		return nomeVaga;
	}

	public void setNomeVaga(String nomeVaga) {
		this.nomeVaga = nomeVaga;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getSalario() {
		return salario;
	}

	public void setSalario(String salario) {
		this.salario = salario;
	}

	public String getModalidade() {
		return modalidade;
	}

	public void setModalidade(String modalidade) {
		this.modalidade = modalidade;
	}
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
