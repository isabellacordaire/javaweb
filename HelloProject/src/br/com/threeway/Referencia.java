package br.com.threeway;

import java.util.Arrays;

public class Referencia {
	public static void main(String[] args){
		int[] idades = {10,20,30};
		
		System.out.println(Arrays.toString(idades));
		
		teste(idades);
		
		System.out.println(Arrays.toString(idades));
		
		
	}
	
	public static void teste(int[] arr){
		for(int i =0; i< arr.length; i++){
			arr[i] = arr[i] + 50;
		}
	}
}
