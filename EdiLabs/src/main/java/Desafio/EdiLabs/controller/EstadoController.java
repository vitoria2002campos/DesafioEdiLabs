package Desafio.EdiLabs.controller;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.opencsv.CSVWriter;

import Desafio.EdiLabs.model.EstadoModel;
import Desafio.EdiLabs.service.EstadoService;

@RestController
public class EstadoController {

	@Autowired
	private EstadoService estadoService;
	
	//Criando arquivo csv
	private static final String CSV_PATH = "regiao.csv";


		
	
	//Métodos GET
	
	//Retornando lista de estados por região
	@GetMapping(value = "{id}/estados")
	public ResponseEntity<List<EstadoModel>> getEstado(@PathVariable long id) {
		
		List<EstadoModel> estadoModel = estadoService.buscaEstadoPorId(id);
		
		return ResponseEntity.status(HttpStatus.OK).body(estadoModel);
		
	}

	//Retornando número de estados por região
	@GetMapping(value = "{id}/regiao")
	public int getRegiao(@PathVariable long id) {
		List<EstadoModel> estados = estadoService.regiaoCSVPorID(id);
		ResponseEntity.status(HttpStatus.OK).body(estados);
		
		return estados.size();
	}
	
	//Retornando o nome da região por ID
	@GetMapping(value = "{id}/regiaoNome")
	public String getNomeRegiao(@PathVariable long id) {
		List<EstadoModel> estados = estadoService.regiaoNomePorID(id);
		ResponseEntity.status(HttpStatus.OK).body(estados);
		
		return  estados.get(0).getRegiao().getNome();
	}
	
	//Criando arquivo csv com nome da região e a quantidade de estados
	@GetMapping(value = "{id}/csv")
	public List getCSV(@PathVariable long id) {
		int qntRegiao = getRegiao(id);
		String nomeRegiao = getNomeRegiao(id);
	List<String[]> data = new ArrayList<String[]>();
		
		
		
	
		try { 
			//Criando objeto CSV
			FileWriter fw = new FileWriter(new File(CSV_PATH));
			CSVWriter cw = new CSVWriter(fw);
			
			String [] headers = {"Nome ", "QuantidadeRegiao"};
			String[] item1 = {nomeRegiao, Integer.toString(qntRegiao)};
			data.add(headers);
			data.add(item1);
			cw.writeAll(data);
			
	
			cw.close();
			fw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return data;
	}

	
	//Criando arquivo CSV para todas as regiões com nome e quantidade de estados
	@GetMapping(value = "{id}/allCSV")
	public List getAllCSV() {
		
			int qntRegiao = getRegiao(1);
			String nomeRegiao = getNomeRegiao(1);
			int qntRegiao2 = getRegiao(2);
			String nomeRegiao2 = getNomeRegiao(2);
			int qntRegiao3 = getRegiao(3);
			String nomeRegiao3 = getNomeRegiao(3);
			int qntRegiao4 = getRegiao(4);
			String nomeRegiao4 = getNomeRegiao(4);
			int qntRegiao5 = getRegiao(5);
			String nomeRegiao5 = getNomeRegiao(5);
		List<String[]> data = new ArrayList<String[]>();
			
			
			

			try {
				FileWriter fw = new FileWriter(new File(CSV_PATH));
				CSVWriter cw = new CSVWriter(fw);
				
				String [] headers = {"Nome |", "qntRegiao"};
				String[] item1 = {nomeRegiao, Integer.toString(qntRegiao)};
				String[] item2 = {nomeRegiao2, Integer.toString(qntRegiao2)};
				String[] item3 = {nomeRegiao3, Integer.toString(qntRegiao3)};
				String[] item4 = {nomeRegiao4, Integer.toString(qntRegiao4)};
				String[] item5 = {nomeRegiao5, Integer.toString(qntRegiao5)};
				data.add(headers);
				data.add(item1);
				data.add(item2);
				data.add(item3);
				data.add(item4);
				data.add(item5);
				cw.writeAll(data);
				
		
				cw.close();
				fw.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			return data;
		
	}
	
}
