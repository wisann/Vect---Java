package model.entities;

import model.services.Product;

public class Eletronico implements Product {
	private String nome;
	private double preco;
	
	public Eletronico(String nome, double preco) {
		
		this.nome = nome;
		this.preco = preco;
	}
	

	@Override
	public String getNome() {
		// TODO Auto-generated method stub
		return nome;
	}
	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return preco;
	}
	@Override
	public double calcularDesconto() {
		// TODO Auto-generated method stub
		return 0;
	}


	public double getPreco() {
		return preco;
	}


	public void setPreco(double preco) {
		this.preco = preco;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}
	
	

}
