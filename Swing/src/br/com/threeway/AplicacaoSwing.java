package br.com.threeway;

import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class AplicacaoSwing {

	JFrame janela;
	JButton botao;
	JLabel rotulo;
	JTextField texto;
	JLabel posicaoMouse;
	
	public AplicacaoSwing(){
		janela = new JFrame("Aplicação Swing");
		
		inicialize();
	}
	
	private void inicialize(){
		
		janela.setSize(300, 150);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setLayout(new FlowLayout());
		
		rotulo = new JLabel("Texto");
		botao = new JButton("Botão");
		posicaoMouse = new JLabel();
		botao.addActionListener(new AcaoBotao());
		
		//implementando eventos por classe interna anonima
		botao.addMouseMotionListener(new MouseMotionListener(){

			@Override
			public void mouseDragged(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseMoved(MouseEvent evento) {
				
				posicaoMouse.setText("Posição X: " + String.valueOf(evento.getX()));
				
			}
			
		});
		//Implementando eventos por classe Adaptadora 
		//Nela não é necessário implementar todas os metodos da interface, somente a classe do evento q interessa
		botao.addMouseListener(new MouseAdapter() {
			public void mouseExited(MouseEvent e){
				posicaoMouse.setText("Mouse saiu");
			}
			
		});
		
		
		
		
		
		
		texto = new JTextField();
		texto.setColumns(15);
		
		//Adiciona o rotulo na janela
		janela.getContentPane().add(rotulo);
		janela.getContentPane().add(texto);
		janela.getContentPane().add(botao);
		janela.getContentPane().add(posicaoMouse);
		
		janela.setVisible(true);
		
		
	}
	
	public static void main (String[] args){
		
		AplicacaoSwing app = new AplicacaoSwing();
	}
}
