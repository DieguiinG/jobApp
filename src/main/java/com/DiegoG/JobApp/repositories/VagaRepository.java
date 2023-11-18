package com.DiegoG.JobApp.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.DiegoG.JobApp.models.Vaga;

public interface VagaRepository  extends CrudRepository<Vaga, Long>{
	
	Vaga findById(long id);
	List<Vaga> findByNomeVaga(String nome);
	List<Vaga> findByArea(String area);
	List<Vaga> findByModalidade(String modalidade);

}
