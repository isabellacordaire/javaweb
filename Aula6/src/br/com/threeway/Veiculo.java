package br.com.threeway;

public class Veiculo {
	public String cor;
	public Integer ano;
	public String identificacao;
	
	public Veiculo(String cor, Integer ano, String identificacao){
		this.cor = cor;
		this.ano = ano;
		this.identificacao = identificacao;
		
	}
	
	public void mover(){
		System.out.println("Veículo em movimento");		
		
	}

}
