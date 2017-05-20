package br.com.threeway;

public class EscopoDeVariavel {
	
	public static void main (String[] args){
		
		// var2 agora esta definida em todo escopo do metodo main
		int var2 = 15;
		
		int var1 = 10;
		
		if (var1 < 100){
			//int var2 = 20;
			var2 = 20;
		} 
		else {
			//int var2 = 21;
			var2 = 21;
		}
		
		// Acesso a var1 é permitido, então não há erro de compilação.
		System.out.println("valor de var1 = " + var1);
		
		// Acesso a var2  é permitido, então erro de compilação será gerado
		System.out.println("valor de var2 = " + var2);
		
	}
//Observe que haverá um erro de compilação. 
//Isto era esperado porque você está tentando ter acesso a variável var2 e
//ela foi declarada dentro das { } do bloco if/else,
//então o escopo de acesso é somente dentro das { } e não pode usada fora de seu escopo.
}
