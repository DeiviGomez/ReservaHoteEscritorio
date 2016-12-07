package com.presentacion.desktop;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JSpinner;
import javax.swing.JButton;

public class FrmTipoHabitacion {

	private JFrame frmTipoHabitacion;
	private JTextField txtNombre;
	private JTextField txtCostoXDia;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmTipoHabitacion window = new FrmTipoHabitacion();
					window.frmTipoHabitacion.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public FrmTipoHabitacion() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTipoHabitacion = new JFrame();
		frmTipoHabitacion.setTitle("Tipo de Habitaci\u00F3n");
		frmTipoHabitacion.setBounds(100, 100, 433, 243);
		frmTipoHabitacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTipoHabitacion.getContentPane().setLayout(null);
		
		JLabel lblCapacidadDePersonas = new JLabel("Capacidad de Personas:");
		lblCapacidadDePersonas.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCapacidadDePersonas.setBounds(10, 124, 145, 14);
		frmTipoHabitacion.getContentPane().add(lblCapacidadDePersonas);
		
		JLabel lblCostoPorDa = new JLabel("Costo por D\u00EDa:");
		lblCostoPorDa.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCostoPorDa.setBounds(10, 93, 145, 14);
		frmTipoHabitacion.getContentPane().add(lblCostoPorDa);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNombre.setBounds(10, 14, 145, 14);
		frmTipoHabitacion.getContentPane().add(lblNombre);
		
		JLabel lblDescripcin = new JLabel("Descripci\u00F3n:");
		lblDescripcin.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDescripcin.setBounds(10, 44, 145, 14);
		frmTipoHabitacion.getContentPane().add(lblDescripcin);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(165, 11, 109, 20);
		frmTipoHabitacion.getContentPane().add(txtNombre);
		txtNombre.setColumns(10);
		
		JTextArea txtDescripcion = new JTextArea();
		txtDescripcion.setBounds(165, 39, 232, 42);
		frmTipoHabitacion.getContentPane().add(txtDescripcion);
		
		JSpinner spnCapacidadPersonas = new JSpinner();
		spnCapacidadPersonas.setBounds(165, 121, 59, 20);
		frmTipoHabitacion.getContentPane().add(spnCapacidadPersonas);
		
		txtCostoXDia = new JTextField();
		txtCostoXDia.setBounds(165, 90, 109, 20);
		frmTipoHabitacion.getContentPane().add(txtCostoXDia);
		txtCostoXDia.setColumns(10);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setBounds(100, 170, 89, 23);
		frmTipoHabitacion.getContentPane().add(btnGuardar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(259, 170, 89, 23);
		frmTipoHabitacion.getContentPane().add(btnCancelar);
	}
}
