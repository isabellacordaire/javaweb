package br.com.threeway;

public class Carro {
	
	//Primeiro vem os atributos
	private String modelo;
	String cor;
	int ano;
	String placa;
	
	//Métodos construtores
	public Carro(){
		System.out.println("Instanciando carro no método construtor");
	}
	
	public Carro(String placa){
		this.placa = placa;
		
	}
	public Carro (String modelo,String cor, int ano, String placa){
		this.modelo = modelo;
		this.cor = cor;
		this.ano = ano;
		this.placa = placa;
	}
	
	//Métodos
	public String acelerar(){
		return modelo + " está acelerando";
	}
	
	public String frear(){
		return "Freando";
	}
	
	public String ligar(){
		return "Ligando";
	}
	
	public String getModelo(){
		return modelo;
		
	}
	public void setModelo(String modelo){
		this.modelo = modelo;
	}
	
	public String toString(){
		return "\n Carro:" + modelo + "\n Cor:" + cor + "\n Ano:" + ano +"\n Placa" + placa;
	}
}
