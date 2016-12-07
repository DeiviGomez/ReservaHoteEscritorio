package com.presentacion.desktop;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;

public class FrmListaTiposHabitacion {

	public JFrame frmListaTiposHabitacion;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmListaTiposHabitacion window = new FrmListaTiposHabitacion();
					window.frmListaTiposHabitacion.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public FrmListaTiposHabitacion() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmListaTiposHabitacion = new JFrame();
		frmListaTiposHabitacion.setTitle("Mantenedor de Tipos de Habitaci\u00F3n");
		frmListaTiposHabitacion.setBounds(100, 100, 450, 300);
		frmListaTiposHabitacion.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmListaTiposHabitacion.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 414, 187);
		frmListaTiposHabitacion.getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JButton btnNuevo = new JButton("Nuevo...");
		btnNuevo.setBounds(40, 216, 89, 23);
		frmListaTiposHabitacion.getContentPane().add(btnNuevo);
		
		JButton btnEditar = new JButton("Editar...");
		btnEditar.setBounds(177, 216, 89, 23);
		frmListaTiposHabitacion.getContentPane().add(btnEditar);
		
		JButton btnEliminar = new JButton("Eliminar...");
		btnEliminar.setBounds(305, 216, 89, 23);
		frmListaTiposHabitacion.getContentPane().add(btnEliminar);
	}
}
