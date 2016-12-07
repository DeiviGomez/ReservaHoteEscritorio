package com.presentacion.desktop;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;

public class FrmHabitacion {

	private JFrame frmHabitacion;
	private JTextField txtCodigo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmHabitacion window = new FrmHabitacion();
					window.frmHabitacion.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public FrmHabitacion() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmHabitacion = new JFrame();
		frmHabitacion.setTitle("Habitaci\u00F3n");
		frmHabitacion.setBounds(100, 100, 294, 169);
		frmHabitacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmHabitacion.getContentPane().setLayout(null);
		
		JLabel lblNroDeHabitacin = new JLabel("Nro. de Habitaci\u00F3n:");
		lblNroDeHabitacin.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNroDeHabitacin.setBounds(10, 11, 122, 21);
		frmHabitacion.getContentPane().add(lblNroDeHabitacin);
		
		JLabel lblTipoDeHabitacin = new JLabel("Tipo de Habitaci\u00F3n:");
		lblTipoDeHabitacin.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTipoDeHabitacin.setBounds(10, 43, 122, 21);
		frmHabitacion.getContentPane().add(lblTipoDeHabitacin);
		
		JComboBox cboTipoHabitacion = new JComboBox();
		cboTipoHabitacion.setBounds(142, 43, 113, 20);
		frmHabitacion.getContentPane().add(cboTipoHabitacion);
		
		txtCodigo = new JTextField();
		txtCodigo.setBounds(142, 11, 86, 20);
		frmHabitacion.getContentPane().add(txtCodigo);
		txtCodigo.setColumns(10);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setBounds(42, 91, 89, 23);
		frmHabitacion.getContentPane().add(btnGuardar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(151, 91, 89, 23);
		frmHabitacion.getContentPane().add(btnCancelar);
	}

}
