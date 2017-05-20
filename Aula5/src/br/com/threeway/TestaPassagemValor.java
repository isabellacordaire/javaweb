package br.com.threeway;

public class TestaPassagemValor {
	
	public static void main(String[] args) {
		int i = 10;
		int x = 20;
		// Imprime valor de i
		System.out.println("inicia método main e i = " + i);
		
		// Chama método test, que está definido abaixo
		// e passa valor inteiro como um parâmetro. Uma vez que
		// int é um tipo primitivo, este argumento e passado
		// por valor.
		test(i, x);
		// imprime o valor de i, note que valor de i não muda
		System.out.println("termina o método main e i = " + i);
	}

	
	// Método estático na classe
	public static void test(int j, int k) {
	
	System.out.println("inicia método test e j = " + j);
	// muda valor parâmetro j
	j = 33;
	k = 66;
	System.out.println("termina método test e j = " + j);
	System.out.println("termina método test e k = " + k);
	}
}
