package br.com.threeway;

public class TesteHerança {
	
	public static void main(String[] args){
		
		Aviao aviao = new Aviao("Branca", 2016, "lwe5656rr", "TAM");
		Carro carro = new Carro("Prata", 2015, "chassi111", "Honda FIT");
		Veiculo veiculo1 = new Veiculo ("Vermelho", 2011, "chassi222");
		Veiculo[] veiculos = new Veiculo [2];
		veiculos[0]= aviao;
		veiculos[1] = carro;
		
		
		aviao.mover();
		carro.mover();
		veiculo1.mover();
		
				
		for(Veiculo veiculo : veiculos){
			veiculo.mover();
			if(veiculo instanceof Aviao){
				((Aviao) veiculo).ligarTurbinas();
			}
		}
		
		
		
	}
}
