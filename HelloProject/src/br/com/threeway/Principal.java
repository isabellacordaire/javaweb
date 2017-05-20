package br.com.threeway;

public class Principal {
	
	public static void main(String[] args){
		//Tipo(nome classe). nomevariavel . método construtor
		Carro carroVariavel = new Carro();
		
		carroVariavel.ano = 2012;
		carroVariavel.cor = "Bronze";
		carroVariavel.setModelo("Honda City");
		carroVariavel.placa = "OMO 7337";
		
		String acelerarCarro = carroVariavel.acelerar();
		System.out.println(acelerarCarro);
		System.out.println(carroVariavel.frear());
		System.out.println(carroVariavel.cor);
		
		Carro carro2 = new Carro("HB20", "azul", 2016,"OMO7557");
		System.out.println(carro2.getModelo() + " " + carro2.cor + " " + carro2.ano + " " + carro2.placa);

		System.out.println(carro2.toString());
				
		
	}

}
