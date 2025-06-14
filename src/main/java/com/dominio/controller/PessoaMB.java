package com.dominio.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.dominio.model.Pessoa;

@Named("bean")
@SessionScoped
public class PessoaMB implements Serializable{

	private static final long serialVersionUID = 1L; 
	
	@Inject
	private Pessoa pessoa;

	private List<Pessoa> pessoas = new ArrayList<>();
	
	
	public String adicionarPessoa() {
		
		if(pessoa.getNome().equals(""))
			return "Nao eh possivel cadastrar";
		pessoas.add(pessoa);
		limpar(); //limpar os campos
		return null; //"paginas/sucesso"
	}
	
	
	
	private void limpar() {
		pessoa = new Pessoa();
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public List<Pessoa> getPessoas() {
		return pessoas;
	}

	public void setPessoas(List<Pessoa> pessoas) {
		this.pessoas = pessoas;
	}
	
	
	
	

}
