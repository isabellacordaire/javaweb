package br.com.threeway;

public class Carro extends Veiculo {
	
	private String modelo;
	
	public Carro(String cor, Integer ano, String identificacao, String modelo){
		super(cor, ano, identificacao);
		this.modelo = modelo;
	}
	
	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public void mover(){
		System.out.println("Carro em movimento");
	}
	

}
