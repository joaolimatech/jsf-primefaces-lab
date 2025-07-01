package com.dominio.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.UploadedFile;

import com.dominio.model.Pessoa;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Named("bean")
@SessionScoped
public class PessoaMB implements Serializable{

	private static final long serialVersionUID = 1L; 
	
	@Inject
	private Pessoa pessoa;

	private List<Pessoa> pessoas = new ArrayList<>();
	
	private UploadedFile file;
	
	private boolean validar1;
	
    public boolean isValidar1() {
		return validar1;
	}

	public void setValidar1(boolean validar1) {
		this.validar1 = validar1;
	}
	
	public void metodoValidar() {
		this.setValidar1(true);
	}

	LocalDateTime sysdate = LocalDateTime.now();
    DateTimeFormatter horaFormatada = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
	
	
	public String adicionarPessoa() {
		
		if(pessoa.getNome().equals(""))
			return "Nao eh possivel cadastrar";
		pessoas.add(pessoa);
		limpar(); //limpar os campos
		return null; //"paginas/sucesso"
	}
	

	
	public void handleFileUpload(FileUploadEvent event) { //recebe o arqv uploadado
		this.file = event.getFile();
		//application code
		System.out.println("Arquivo "+file.getFileName()+" recebido com sucesso as "+sysdate.format(horaFormatada));
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
