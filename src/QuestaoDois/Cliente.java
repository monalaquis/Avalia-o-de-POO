package QuestaoDois;

import java.util.ArrayList;

public class Cliente {

	private int id;
	private String nome;
	private int idade;
	private String telefone;
	private static ArrayList <Cliente> clientes = new ArrayList<>();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	

	public Cliente(int id, String nome, int idade, String telefone) {
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.telefone = telefone;
		
		clientes.add(this);
	}
	
	public static void mostraClinCadastrado() {
		for (Cliente cliente : clientes) {
			
			System.out.println("ID: "+cliente.id);
			System.out.println("Nome: "+cliente.nome);
			System.out.println("Idade: "+cliente.idade);
			System.out.println("Telefone: "+cliente.telefone);
			
		}
	}
	
}
