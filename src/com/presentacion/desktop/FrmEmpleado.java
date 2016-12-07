package com.presentacion.desktop;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JPasswordField;

public class FrmEmpleado {

	private JFrame frmEmpleado;
	private JTextField txtNombre;
	private JTextField txtApellidoPaterno;
	private JTextField txtApellidoMaterno;
	private JTextField txtDni;
	private JTextField txtDireccion;
	private JTextField txtCelular;
	private JTextField txtTelefono;
	private JTextField txtNickname;
	private JPasswordField txtContrasena;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmEmpleado window = new FrmEmpleado();
					window.frmEmpleado.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public FrmEmpleado() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmEmpleado = new JFrame();
		frmEmpleado.setTitle("Empleado");
		frmEmpleado.setBounds(100, 100, 396, 376);
		frmEmpleado.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmEmpleado.getContentPane().setLayout(null);
		
		JLabel lblNombres = new JLabel("Nombres:");
		lblNombres.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNombres.setBounds(20, 11, 92, 23);
		frmEmpleado.getContentPane().add(lblNombres);
		
		JLabel lblApellidoPaterno = new JLabel("Apellido Paterno:");
		lblApellidoPaterno.setHorizontalAlignment(SwingConstants.RIGHT);
		lblApellidoPaterno.setBounds(20, 38, 92, 23);
		frmEmpleado.getContentPane().add(lblApellidoPaterno);
		
		JLabel lblApellidoPaterno_1 = new JLabel("Apellido Materno");
		lblApellidoPaterno_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblApellidoPaterno_1.setBounds(20, 66, 92, 23);
		frmEmpleado.getContentPane().add(lblApellidoPaterno_1);
		
		JLabel lblDni = new JLabel("DNI:");
		lblDni.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDni.setBounds(20, 96, 92, 23);
		frmEmpleado.getContentPane().add(lblDni);
		
		JLabel lblDireccin = new JLabel("Direcci\u00F3n");
		lblDireccin.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDireccin.setBounds(20, 123, 92, 23);
		frmEmpleado.getContentPane().add(lblDireccin);
		
		JLabel lblCelular = new JLabel("Celular:");
		lblCelular.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCelular.setBounds(20, 151, 92, 23);
		frmEmpleado.getContentPane().add(lblCelular);
		
		JLabel lblTelfonoFijo = new JLabel("Tel\u00E9fono Fijo:");
		lblTelfonoFijo.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTelfonoFijo.setBounds(20, 179, 92, 23);
		frmEmpleado.getContentPane().add(lblTelfonoFijo);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(121, 11, 151, 20);
		frmEmpleado.getContentPane().add(txtNombre);
		txtNombre.setColumns(10);
		
		JLabel lblTipoDeUsuario = new JLabel("Tipo de Usuario:");
		lblTipoDeUsuario.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTipoDeUsuario.setBounds(20, 207, 92, 23);
		frmEmpleado.getContentPane().add(lblTipoDeUsuario);
		
		JLabel lblUsuario = new JLabel("Usuario:");
		lblUsuario.setHorizontalAlignment(SwingConstants.RIGHT);
		lblUsuario.setBounds(20, 235, 92, 23);
		frmEmpleado.getContentPane().add(lblUsuario);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPassword.setBounds(20, 261, 92, 23);
		frmEmpleado.getContentPane().add(lblPassword);
		
		txtApellidoPaterno = new JTextField();
		txtApellidoPaterno.setColumns(10);
		txtApellidoPaterno.setBounds(121, 38, 151, 20);
		frmEmpleado.getContentPane().add(txtApellidoPaterno);
		
		txtApellidoMaterno = new JTextField();
		txtApellidoMaterno.setColumns(10);
		txtApellidoMaterno.setBounds(121, 66, 151, 20);
		frmEmpleado.getContentPane().add(txtApellidoMaterno);
		
		txtDni = new JTextField();
		txtDni.setColumns(10);
		txtDni.setBounds(121, 95, 86, 20);
		frmEmpleado.getContentPane().add(txtDni);
		
		txtDireccion = new JTextField();
		txtDireccion.setColumns(10);
		txtDireccion.setBounds(121, 123, 236, 20);
		frmEmpleado.getContentPane().add(txtDireccion);
		
		txtCelular = new JTextField();
		txtCelular.setColumns(10);
		txtCelular.setBounds(121, 151, 86, 20);
		frmEmpleado.getContentPane().add(txtCelular);
		
		txtTelefono = new JTextField();
		txtTelefono.setColumns(10);
		txtTelefono.setBounds(121, 179, 86, 20);
		frmEmpleado.getContentPane().add(txtTelefono);
		
		txtNickname = new JTextField();
		txtNickname.setColumns(10);
		txtNickname.setBounds(121, 235, 151, 20);
		frmEmpleado.getContentPane().add(txtNickname);
		
		JComboBox cboTipoUsuario = new JComboBox();
		cboTipoUsuario.setBounds(121, 207, 151, 20);
		frmEmpleado.getContentPane().add(cboTipoUsuario);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setBounds(67, 299, 89, 23);
		frmEmpleado.getContentPane().add(btnGuardar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(226, 299, 89, 23);
		frmEmpleado.getContentPane().add(btnCancelar);
		
		txtContrasena = new JPasswordField();
		txtContrasena.setBounds(121, 261, 151, 20);
		frmEmpleado.getContentPane().add(txtContrasena);
	}
}
