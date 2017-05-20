package br.com.threeway;

public class CastingPrimitivos {
	
	public static void main(String[] args){
		
		// casting implicito exemplo 1
		int numInt = 10;
		double numDouble = numInt;
		System.out.println("int " + numInt + 
				" e implicitamente moldado para double " +	numDouble);
		
		// casting implicito exemplo 2
		int numInt1 = 3;
		int numInt2 = 2;
		double numDouble2 = numInt1 / numInt2;
		System.out.println("numInt1/numInt2 " + numInt1 / numInt2 + " e implicitamente moldado para " 
		+ numDouble2);
		
		// casting explicito exemplo 1
		double valDouble = 10.12;
		int valInt = (int) valDouble;
		System.out.println("double " + valDouble + " e explicitamente moldado para int " +
		valInt);
		
		// casting explicito exemplo 2
		double x = 10.2;
		int y = 2;
		int resultado = (int) ( x / y );
		System.out.println("x/y " + x / y + " e explicitamente moldado para int " + resultado);
		
		//ong ->byte, float->short, int-> char.
		
		long numLong = 10000;
		byte numByte = (byte) numLong;
		System.out.println("O valor de numLong é "+ numLong + " O valor de numByte é " + numByte);
		
		float numFloat = 10.8f;
		short numShort = (short)numFloat;
		System.out.println("O valor de numFloat é "+ numFloat + " O valor de numShort é " + numShort);
		
		int numInt3 = 5;
		char numChar = (char)numInt3;
		System.out.println("O valor de numInt3 é " + numInt3 + " O Valor do numChar é " + numChar);
		
		
		
				
	}
//Em (1) e (2) ocorre uma conversão explicita dos tipos, 
//ou seja, o Java o faz automaticamente. Em (2) ocorre uma
//divisão de números inteiros resultado em um número inteiro 
//que é transformado em double. Já em (3) há uma divisão de
//inteiro/double resultando em um double. Neste caso dizemos 
//que está ocorrendo uma promoção numérica ou um alargamento do tipo.
	
	
	
}
