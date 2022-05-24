package br.com.guiVitoriano.app.bean;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class LoginBean implements Serializable {
	
	private String nome;
	private String senha;
	
	@PostConstruct /*Chama o método abaixo logo ao construir o Bean*/
	public void onCreate() {
		
		System.out.println("Bean criado");
		
	}
	
	@PreDestroy /*Chama o método abaixo logo ao destruir o Bean*/
	public void onDestroy() {
		
		System.out.println("Bean destruido");
		
	}
	
	public String doLogin() {
		
		if("abc".equals(nome) && "123".equals(senha)) {
			
			return "sucesso";
			
		} else {
			
			return null;
			
		}
		
	}
	
	public String getNome() {
		
		return nome;
		
	}

	public void setNome(String nome) {
		
		this.nome = nome;
		
	}

	public String getSenha() {
		
		return senha;
		
	}

	public void setSenha(String senha) {
		
		this.senha = senha;
		
	}
	
}
