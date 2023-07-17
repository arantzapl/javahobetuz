package com.ipartek.formacion.poo.pruebas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.FlowLayout;

public class WindowBuilderPrueba {

	private JFrame frame;
	private JTextField tfNombre;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WindowBuilderPrueba window = new WindowBuilderPrueba();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public WindowBuilderPrueba() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 436, 264);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(71, 9, 52, 19);
		lblNombre.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblNombre);
		
		tfNombre = new JTextField();
		tfNombre.setBounds(150, 8, 86, 20);
		frame.getContentPane().add(tfNombre);
		tfNombre.setColumns(10);
		
		JLabel lblResultado = new JLabel("Introduce tu nombre para que te salude");
		lblResultado.setBounds(101, 39, 192, 14);
		frame.getContentPane().add(lblResultado);
		
		JButton btnSaludar = new JButton("Saludar");
		btnSaludar.setBounds(267, 5, 86, 23);
		btnSaludar.addActionListener(e -> lblResultado.setText("Hola " + tfNombre));
		frame.getContentPane().add(btnSaludar);
		

	}

}
