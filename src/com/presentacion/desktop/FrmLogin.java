package com.presentacion.desktop;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import AccesoDatos.PersonaDL;
import AccesoDatos.UsuarioDL;
import Entidades.PersonaEL;

import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrmLogin {

	private JFrame frmInicioSesion;
	private JTextField txtNickname;
	public PersonaEL usuarioAutenticado;
	private JTextField txtContrasena;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmLogin window = new FrmLogin();
					window.frmInicioSesion.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public FrmLogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmInicioSesion = new JFrame();
		frmInicioSesion.setTitle("Inicio de Sesi\u00F3n");
		frmInicioSesion.setBounds(100, 100, 351, 203);
		frmInicioSesion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmInicioSesion.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("Usuario:");
		label.setBounds(24, 27, 91, 14);
		frmInicioSesion.getContentPane().add(label);
		
		txtNickname = new JTextField();
		txtNickname.setColumns(10);
		txtNickname.setBounds(125, 23, 187, 22);
		frmInicioSesion.getContentPane().add(txtNickname);
		
		JLabel label_1 = new JLabel("Password:");
		label_1.setBounds(24, 59, 91, 14);
		frmInicioSesion.getContentPane().add(label_1);
		
		JButton btnIniciarSesion = new JButton("Iniciar como Administrador");
		btnIniciarSesion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					usuarioAutenticado = UsuarioDL.instancia().VerificarAcessoPorPlataforma(txtNickname.getText(), txtContrasena.getText(), "2"); 
					FrmPrincipal ventana = new FrmPrincipal(usuarioAutenticado);
					ventana.frmPrincipal.setVisible(true);
					frmInicioSesion.dispose();
				} catch (ArithmeticException e) {
					JOptionPane.showMessageDialog(null, e.getMessage().toString(), "Error", JOptionPane.WARNING_MESSAGE);
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, e.getMessage().toString(), "Error", JOptionPane.WARNING_MESSAGE);
				} 
			}
		});
		
		btnIniciarSesion.setBounds(24, 95, 288, 22);
		frmInicioSesion.getContentPane().add(btnIniciarSesion);
		
		txtContrasena = new JTextField();
		txtContrasena.setBounds(125, 56, 187, 20);
		frmInicioSesion.getContentPane().add(txtContrasena);
		txtContrasena.setColumns(10);
		
		JButton btnIniciarComoEmpleado = new JButton("Iniciar como Empleado");
		btnIniciarComoEmpleado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					usuarioAutenticado = UsuarioDL.instancia().VerificarAcessoPorPlataforma(txtNickname.getText(), txtContrasena.getText(), "3"); 
					FrmPrincipal ventana = new FrmPrincipal(usuarioAutenticado);
					ventana.frmPrincipal.setVisible(true);
					frmInicioSesion.dispose();
				} catch (ArithmeticException e) {
					JOptionPane.showMessageDialog(null, e.getMessage().toString(), "Error", JOptionPane.WARNING_MESSAGE);
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, e.getMessage().toString(), "Error", JOptionPane.WARNING_MESSAGE);
				} 
			}
		});
		btnIniciarComoEmpleado.setBounds(24, 125, 288, 22);
		frmInicioSesion.getContentPane().add(btnIniciarComoEmpleado);
	}
}
