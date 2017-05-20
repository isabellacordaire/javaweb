package br.com.threeway;

public class TresTiposDeVariaveis {
	
	// Exemplo de variável estática
	static String staticVariable = "Variável de classe, ou estática";
	
	// Exemplo de variável de instância
	String instanceVariable = "variável de instância";
	
	public static void main(String[] args){
		
		TresTiposDeVariaveis teste = new TresTiposDeVariaveis (); 
		String localVariable = "variável local";
		System.out.println("Variável estática = " + staticVariable);
		System.out.println("Variável de instância = " + teste.instanceVariable);
		System.out.println("Variável local = " + localVariable);
		
		
	}
//Observe que variáveis de instância não podem ser referenciadas 
//dentro de um contexto estático, o método main() é	estático.
}
