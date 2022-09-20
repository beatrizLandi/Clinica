package br.senai.sp.jandira.model;

public class Especialidade {

	private String nome;
	private String descricao;
	
	//metodo de acesso
	
	public void setNome(String novoNome) {
		nome=novoNome;
	}
	
	public String getNome() {
		return nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
}
