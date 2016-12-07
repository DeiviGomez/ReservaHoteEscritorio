package com.presentacion.desktop;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class FrmListaHabitaciones {

	public JFrame frmListaHabitaciones;
	private JTable jtHabitaciones;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmListaHabitaciones window = new FrmListaHabitaciones();
					window.frmListaHabitaciones.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public FrmListaHabitaciones() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmListaHabitaciones = new JFrame();
		frmListaHabitaciones.setTitle("Mantenedor de Habitaciones");
		frmListaHabitaciones.setBounds(100, 100, 450, 300);
		frmListaHabitaciones.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmListaHabitaciones.getContentPane().setLayout(null);
		
		JButton btnEliminar = new JButton("Eliminar...");
		btnEliminar.setBounds(305, 227, 89, 23);
		frmListaHabitaciones.getContentPane().add(btnEliminar);
		
		JButton btnEditar = new JButton("Editar...");
		btnEditar.setBounds(177, 227, 89, 23);
		frmListaHabitaciones.getContentPane().add(btnEditar);
		
		JButton btnNuevo = new JButton("Nuevo...");
		btnNuevo.setBounds(40, 227, 89, 23);
		frmListaHabitaciones.getContentPane().add(btnNuevo);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 414, 205);
		frmListaHabitaciones.getContentPane().add(scrollPane);
		
		jtHabitaciones = new JTable();
		scrollPane.setViewportView(jtHabitaciones);
	}

}
