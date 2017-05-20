package br.com.threeway.exemplo;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class CadastroPessoa extends JFrame {

	private JPanel contentPane;
	private JTextField textNome;
	private JTextField textTelefone;
	private JTextField textEndereço;
	Pessoa pessoa = new Pessoa();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroPessoa frame = new CadastroPessoa();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CadastroPessoa() {
		setTitle("Cadastro de Pessoas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 538, 353);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(12, 12, 70, 15);
		contentPane.add(lblNome);
		
		JLabel lblEndereo = new JLabel("Endereço");
		lblEndereo.setBounds(12, 71, 70, 25);
		contentPane.add(lblEndereo);
		
		textNome = new JTextField();
		textNome.setBounds(93, 10, 374, 20);
		contentPane.add(textNome);
		textNome.setColumns(10);
		
		textTelefone = new JTextField();
		textTelefone.setBounds(93, 42, 189, 20);
		contentPane.add(textTelefone);
		textTelefone.setColumns(10);
		
		textEndereço = new JTextField();
		textEndereço.setBounds(93, 74, 374, 19);
		contentPane.add(textEndereço);
		textEndereço.setColumns(10);
		
		JLabel lblTelefone = new JLabel("Telefone");
		lblTelefone.setBounds(12, 39, 70, 20);
		contentPane.add(lblTelefone);
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.setBounds(203, 105, 117, 25);
		contentPane.add(btnEntrar);
		
		btnEntrar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
		
				pessoa.setEndereco(textEndereço.getText());
				pessoa.setNome(textNome.getText());
				pessoa.setTelefone(textTelefone.getText());
				textEndereço.setText("");
				textNome.setText("");
				textTelefone.setText("");
			}
		});
		
		JLabel enderecoPessoa = new JLabel();
		enderecoPessoa.setText("endereco");
		enderecoPessoa.setBounds(12, 288, 455, 25);
		
		JLabel telefonePessoa = new JLabel();
		telefonePessoa.setText("telefone");
		telefonePessoa.setBounds(12, 243, 270, 25);
		//CRIAR LABEL
		JLabel nomePessoa = new JLabel();
		nomePessoa.setText("nome");
		nomePessoa.setBounds(12, 205, 472, 15);
		
		//ADICIONA LABEL NO FRAME
		contentPane.add(nomePessoa);
		contentPane.add(enderecoPessoa);
		contentPane.add(telefonePessoa);
		
		JButton botaoVisualizar = new JButton("Visualizar");
		contentPane.add(botaoVisualizar);
		botaoVisualizar.setBounds(203, 158, 117, 25);
		
		botaoVisualizar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				nomePessoa.setText(pessoa.getNome());
				enderecoPessoa.setText(pessoa.getEndereco());
				telefonePessoa.setText(pessoa.getTelefone());
			}
		});
		
		
	}
}
