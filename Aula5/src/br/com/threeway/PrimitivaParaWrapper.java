package br.com.threeway;

public class PrimitivaParaWrapper {
	public static void main(String[] args) {
	
		// cria uma instância de objeto Integer
		Integer intObjeto = new Integer(7801);
		
		// Converte de Integer para primitivo int usando método intValue()
		int intPrimitiva = intObjeto.intValue();
		
		System.out.println("int intPrimitiva = " + intPrimitiva);
		
		// Usando método estático da classe empacotadora Integer
		// para converter uma String para o tipo primitivo int
		String strInt = "65000";
		int intConvertida = Integer.parseInt(strInt);
		System.out.println("int intConvertida = " + intConvertida);
		// Converte int primitivo para tipo Integer
		Integer intObjeto2 = new Integer(intConvertida);
		System.out.println("Integer intObjeto2 = " + intObjeto2);
		
		Long longObjeto = new Long (46546546);
		long longPrimitivo = longObjeto.longValue();
		System.out.println("Long longObjeto = " + longPrimitivo);
		
		
	}

}
