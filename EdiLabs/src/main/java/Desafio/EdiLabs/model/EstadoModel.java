package Desafio.EdiLabs.model;

import org.springframework.stereotype.Service;
/*
 * Annotation @Service identifica o componente sendo um serviço
 * por se tratar de um serviço externo foi necessário realizar a anotação
 */
@Service
public class EstadoModel {

	private long id;
	private String sigla;
	private String nome;
	private RegiaoModel regiao;

	public EstadoModel() {
		
	}

	public EstadoModel(long id, String sigla, String nome, RegiaoModel regiao) {
		this.id = id;
		this.sigla = sigla;
		this.nome = nome;
		this.regiao = regiao;
	}


	// Get e Set
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public RegiaoModel getRegiao() {
		return regiao;
	}
}
