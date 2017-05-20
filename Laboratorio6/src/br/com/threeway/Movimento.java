package br.com.threeway;
import java.util.*;


public class Movimento <T> {
	
	private ArrayList<T> transacoes;
	

	public Movimento() {
		
		this.transacoes = new ArrayList<T> ();
		
		
	}
	
	public void add(T transacao){
		
		transacoes.add(transacao);
	}
	
	public Iterator<T> getTransacoes() {
		return transacoes.iterator();
	}

}
