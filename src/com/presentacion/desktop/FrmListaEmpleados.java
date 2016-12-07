package com.presentacion.desktop;

import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import AccesoDatos.PersonaDL;
import Entidades.PersonaEL;

public class FrmListaEmpleados {

	public JFrame frmMantenedorDeEmpleados;
	private JTable jtEmpleados;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmListaEmpleados window = new FrmListaEmpleados();
					window.frmMantenedorDeEmpleados.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public FrmListaEmpleados() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMantenedorDeEmpleados = new JFrame();
		frmMantenedorDeEmpleados.setTitle("Mantenedor de Empleados");
		frmMantenedorDeEmpleados.setBounds(100, 100, 450, 300);
		frmMantenedorDeEmpleados.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmMantenedorDeEmpleados.getContentPane().setLayout(null);
		
		DefaultTableModel modelo = new DefaultTableModel();
		modelo.addColumn("Nombre Completo");
		modelo.addColumn("DNI");
		modelo.addColumn("Rango");
		modelo.addColumn("Nick Name");
				
		try{
			ArrayList<PersonaEL> lista = new ArrayList<PersonaEL>();
			lista = PersonaDL.instancia().sp_ListarEmpleados();
			for(PersonaEL empleado : lista){
				modelo.addRow(new Object[]{
					empleado.getNombre() + " " + empleado.getApellidopaterno() + " " + empleado.getApellidopaterno(),
					empleado.getDni(),
					empleado.getUsuario().getTipoUsuario().equals("2") ? "Administrador" : "Empleado",
					empleado.getUsuario().getNickname()
				});
			}
		}catch(Exception ex){
			JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.WARNING_MESSAGE);
		}
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 414, 205);
		frmMantenedorDeEmpleados.getContentPane().add(scrollPane);
		
		jtEmpleados = new JTable();
		scrollPane.setViewportView(jtEmpleados);
		
		JButton btnNuevo = new JButton("Nuevo...");
		btnNuevo.setBounds(40, 226, 89, 23);
		frmMantenedorDeEmpleados.getContentPane().add(btnNuevo);
		
		JButton btnEditar = new JButton("Editar...");
		btnEditar.setBounds(177, 226, 89, 23);
		frmMantenedorDeEmpleados.getContentPane().add(btnEditar);
		
		JButton btnEliminar = new JButton("Eliminar...");
		btnEliminar.setBounds(305, 226, 89, 23);
		frmMantenedorDeEmpleados.getContentPane().add(btnEliminar);
		
		jtEmpleados.setModel(modelo);
		jtEmpleados.getColumnModel().getColumn(0).setPreferredWidth(150);
		jtEmpleados.getColumnModel().getColumn(1).setPreferredWidth(40);
		jtEmpleados.getColumnModel().getColumn(2).setPreferredWidth(60);
		jtEmpleados.getColumnModel().getColumn(3).setPreferredWidth(60);
	}
}
