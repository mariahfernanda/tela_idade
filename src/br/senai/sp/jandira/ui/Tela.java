package br.senai.sp.jandira.ui;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Tela {

	public void criarTela() {
		JFrame telaImc = new JFrame();
		telaImc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		telaImc.setSize(600, 800);
		telaImc.setTitle("Calculadora IMC");
		telaImc.setLayout(null);

		// Criar um label
		JLabel lblIdade = new JLabel();
		lblIdade.setText("Qual a sua idade? ");
		lblIdade.setBounds(20, 10, 110, 40);

		// Criar texto
		JTextField txtIdade = new JTextField();
		txtIdade.setText("");
		txtIdade.setBounds(20, 45, 100, 30);

		// Criar botão
		JButton btnVerificar = new JButton();
		btnVerificar.setText("Verificar idade: ");
		btnVerificar.setBounds(135, 45, 130, 30);

		// Colocar resultado
		JLabel lblResult = new JLabel();
		lblResult.setText("Resultado da idade: ");
		lblResult.setBounds(20, 80, 245, 30);

		// Colocar o label na tela
		telaImc.getContentPane().add(lblIdade);
		telaImc.getContentPane().add(btnVerificar);
		telaImc.getContentPane().add(txtIdade);
		telaImc.getContentPane().add(lblResult);

		telaImc.setVisible(true);

		// Definir ouvinte de click do mouse
		txtIdade.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
				System.out.println("soltou!!");

			}

			@Override
			public void mousePressed(MouseEvent e) {
				System.out.println("apertou!!");

			}

			@Override
			public void mouseExited(MouseEvent e) {
				System.out.println("saiu!!");

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				System.out.println("entrou!!");

			}

			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println();

			}
		});

		//
		txtIdade.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
			System.out.println("tecla solta!!");

			}

			@Override
			public void keyReleased(KeyEvent e) {
			System.out.println("tecla digitada !!");
			System.out.println(e.getKeyChar());
			System.out.println(e.getKeyCode());
			
			}

			@Override
			public void keyPressed(KeyEvent e) {
			System.out.println("tecla apertada!!");

			}
		});
	}
}
