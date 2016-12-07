package com.presentacion.desktop;

import java.awt.EventQueue;

import javax.swing.JFrame;

import Entidades.PersonaEL;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrmPrincipal {

	public JFrame frmPrincipal;
	private PersonaEL usuarioAutenticado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmPrincipal window = new FrmPrincipal();
					window.frmPrincipal.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public FrmPrincipal() {
		initialize();
	}
	
	public FrmPrincipal(PersonaEL usuario){
		usuarioAutenticado = usuario;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPrincipal = new JFrame();
		frmPrincipal.setTitle("Opciones");
		frmPrincipal.setBounds(100, 100, 303, 185);
		frmPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPrincipal.getContentPane().setLayout(null);
		
		JButton btnTiposHabitacion = new JButton("Mantenedor de Tipos de Habitacion");
		btnTiposHabitacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FrmListaTiposHabitacion ventana = new FrmListaTiposHabitacion();
				ventana.frmListaTiposHabitacion.setVisible(true);
			}
		});
		btnTiposHabitacion.setBounds(25, 21, 233, 23);
		frmPrincipal.getContentPane().add(btnTiposHabitacion);
		
		JButton btnHabitaciones = new JButton("Mantenedor de Habitaciones");
		btnHabitaciones.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FrmListaHabitaciones ventana = new FrmListaHabitaciones();
				ventana.frmListaHabitaciones.setVisible(true);
			}
		});
		btnHabitaciones.setBounds(25, 55, 233, 23);
		frmPrincipal.getContentPane().add(btnHabitaciones);
		
		JButton btnEmpleados = new JButton("Mantenedor de Empleados");
		btnEmpleados.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				FrmListaEmpleados ventana = new FrmListaEmpleados();
				ventana.frmMantenedorDeEmpleados.setVisible(true);
			}
		});
		btnEmpleados.setBounds(25, 89, 233, 23);
		btnEmpleados.setVisible(false);
		if (usuarioAutenticado.getUsuario().getTipoUsuario().equals("2"))
			btnEmpleados.setVisible(true);
		frmPrincipal.getContentPane().add(btnEmpleados);
	}

}
