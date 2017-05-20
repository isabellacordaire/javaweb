package br.com.threeway;

public class TestaIgualdadeObjeto {
	public static void main(String[] args) {
		// Declara duas variáveis do tipo String, str1 e str2
		String str1, str2;
		// Inicializando as variáveis. Note que as variáveis contem
		// ponteiros para instância de mesmo objeto atual.
		str1 = "Viver sem Deus...não é viver!";
		str2 = str1;
		// Mostra o valor das variáveis str1 e str2
		System.out.println("String1: " + str1);
		System.out.println("String2: " + str2);
		// A notação "==", quando e usada com variáveis de referência,
		// se retornar true significa que as variáveis apontam para
		// mesma instância de um objeto, e se false não, são referencias diferentes
		// Checa se str1 e str2 são o mesmo objeto para as duas variáveis
		// apontando para mesma instância de um objeto do tipo String
		System.out.println("Mesmo objeto? " + ( str1 == str2 ));
		// Reinicializa variável str2. Ela agora aponta para um nova
		// instância de objeto String
		str2 = new String(str1);
		// Mostra valor das variáveis str1 e str2
		System.out.println("String1: " + str1);
		System.out.println("String2: " + str2);
		// Checa novamente se str1 e str2 são os mesmos
		// objetos para as duas variáveis
		// apontando para mesma instância de um objeto do tipo String
		System.out.println("Mesmo objeto? " + ( str1 == str2 ));
		// Checa se str1 e str2 tem o mesmo valor
		System.out.println("Mesmo valor? " + str1.equals(str2));
		
		Integer numInteger1;
		Integer numInteger2;
		
		numInteger1 =  10;
		numInteger2 =  10;
		
		System.out.println("Mesmo Objeto (Integer) " + (numInteger1 == numInteger2));
		System.out.println("Mesmo valor? " + numInteger1.equals(numInteger2));
}
	
//String são objetos especiais em Java, podemos criar instâncias de objetos apenas atribuindo um literal a uma variável do tipo
//String.
//Além disso, cada objeto String criado desta forma apontam para mesma instância do objeto, ou seja qualquer literal
//String igual ao anterior apontará para o mesmo objeto.
	

}