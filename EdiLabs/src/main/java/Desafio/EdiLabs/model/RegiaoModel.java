package Desafio.EdiLabs.model;

import org.springframework.stereotype.Service;

@Service
public class RegiaoModel {

	private long id;
	private String sigla;
	private String nome;
	
	public RegiaoModel() {
	}
	
	public RegiaoModel(long id, String sigla, String nome) {
		this.id = id;
		this.sigla = sigla;
		this.nome = nome;
	}
	
	
	//GET E SET
	public long getId() {
		return id;
	}
	public String getSigla() {
		return sigla;
	}
	public String getNome() {
		return nome;
	}
}
