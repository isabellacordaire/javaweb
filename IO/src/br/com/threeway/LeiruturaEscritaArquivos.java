package br.com.threeway;

import java.util.List;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class LeiruturaEscritaArquivos {
	
	public static void main(String[] args){
		
		try{
			Path arquivo = Paths.get("/home/javasabmat/teste.txt");
			List<String> texto = new ArrayList<>();
			texto.add("Texto1");
			texto.add("Texto2");
			
			Files.write(arquivo,  texto,  Charset.forName("UTF-8"));
			
			List<String> leitura = Files.readAllLines(arquivo,  Charset.forName("UTF-8"));
			leitura.forEach(System.out::println);
					
			
			
		}catch (IOException e){}
		
		
	}
	
	
	
	
	
	public static void ioAntigo(String[] args){
		try{
			File arquivo = new File("/home/javasabmat/teste.txt");
			
			if(!arquivo.exists()){
				arquivo.createNewFile();
			}
			
			FileWriter fw = new FileWriter(arquivo);
			BufferedWriter bw = new BufferedWriter(fw);
			
			bw.newLine();
			bw.write("Olá mundo dos arquivos!!!");
			
			bw.close();
			fw.close();
			
			//Leitura
			FileReader fr = new FileReader(arquivo);
			BufferedReader br = new BufferedReader(fr);
			
			StringBuilder textoDoArquivo = new StringBuilder();
			
			while(br.ready()){
				textoDoArquivo.append(br.readLine());
			}
			
			String resultado = textoDoArquivo.toString();
			System.out.println(resultado);
			
		
		}catch (IOException e){
		System.out.println("Ocorreu um erro "+ e);
	}
		
		
	}
	
	

}
