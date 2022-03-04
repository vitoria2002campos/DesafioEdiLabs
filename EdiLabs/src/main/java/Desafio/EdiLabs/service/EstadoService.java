package Desafio.EdiLabs.service;


import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import Desafio.EdiLabs.model.EstadoModel;

//URL da API 
@FeignClient(url = "https://servicodados.ibge.gov.br/api/v1/localidades/regioes", name = "estagoregiao")
public interface EstadoService {

	//Métodos GET
	@GetMapping("{id}/estados")
    List<EstadoModel>buscaEstadoPorId(@PathVariable("id") long id);
	

	@GetMapping("{id}/estados")
	List<EstadoModel>regiaoCSVPorID(@PathVariable("id") long id);

	@GetMapping("{id}/estados")
	List<EstadoModel>regiaoNomePorID(@PathVariable("id") long id);
	
	@GetMapping("{id}/estados")
	List<EstadoModel>regiaoCSV(@PathVariable("id") long id);
	
}




