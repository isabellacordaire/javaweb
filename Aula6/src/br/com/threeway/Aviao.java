package br.com.threeway;

public class Aviao extends Veiculo {
	
	private String companhiaAerea;
	
	public Aviao(String cor, Integer ano, String identificacao, String companhiaAerea){
		super (cor, ano, identificacao);
		this.companhiaAerea = companhiaAerea;
	}
	

public String getCompanhiaAerea() {
		return companhiaAerea;
	}


	public void setCompanhiaAerea(String companhiaAerea) {
		this.companhiaAerea = companhiaAerea;
	}


@Override

	public void mover(){
		System.out.println("Avião voando");
	}

	public void ligarTurbinas(){
		System.out.println("Ligando turbinas do Avião");
		
	}
}