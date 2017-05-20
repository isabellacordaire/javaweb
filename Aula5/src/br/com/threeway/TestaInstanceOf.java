package br.com.threeway;

public class TestaInstanceOf {
	public static void main(String[] args) {
		// Criar objeto String
		String str1 = "Aprenda Java em Dez anos!";
		Integer int1 = new Integer(40);
		// Checa se str1 é do tipo String usando operador instanceof.
		// Checa também se é do tipo Object.
		boolean b1 = str1 instanceof String;
		System.out.println("str1 é String: " + b1);
		boolean b2 = str1 instanceof Object;
		System.out.println("str1 é Object: " + b2);
		// Checa se int1 é do tipo Integer usando operador instanceof.
		// Checa também se é do tipo Object.
		b1 = int1 instanceof Integer;
		System.out.println("int1 é do tipo Integer: " + b1);
		b2 = int1 instanceof Object;
		System.out.println("int1 é Object: " + b2);
		b2 = int1 instanceof Number;
		System.out.println("int1 é do tipo Number: " + b2);
		}
}
