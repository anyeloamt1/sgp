package com.lacsoft.gestorpacientes.vista;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import com.lacsoft.gestorpacientes.factorias.FactoriaDeBotones;
import com.lacsoft.gestorpacientes.factorias.FactoriaDeBotonesGenericos;
import com.lacsoft.gestorpacientes.factorias.FactoriaDeCombos;
import com.lacsoft.gestorpacientes.factorias.FactoriaDeCombosGenericos;
import com.lacsoft.gestorpacientes.factorias.FactoriaDeLabels;
import com.lacsoft.gestorpacientes.factorias.FactoriaDeLabelsGenericos;
import com.lacsoft.gestorpacientes.factorias.FactoriaDeTablas;
import com.lacsoft.gestorpacientes.factorias.FactoriaDeTablasGenericas;
import com.lacsoft.gestorpacientes.factorias.FactoriaDeTextos;
import com.lacsoft.gestorpacientes.factorias.FactoriaDeTextosGenericos;

public class PanelResultadosPruebasLaboratorio extends JPanel {

	private static final long serialVersionUID = 1L;

	private JPanel pnlBuscador, pnlDatosPruebas, pnlResultado;
	private JLabel lblBuscar, lblNombre, lblApellido, lblCedula,
			lblNombrePrueba, lblResultados, lblFechaResultados,
			lblHoraResultados;
	private JComboBox<String> comboBuscar;
	private JTextField txtBuscar, txtNombre, txtApellido, txtCedula,
			txtNombrePrueba, txtFechaResultados, txtHoraResultados;
	private JButton btnBuscar, btnEntregar;
	private JScrollPane scrollTabla, scrollResultados;
	private JTable tablaResultados;
	private JTextArea txtResultados;

	private FactoriaDeLabels factoriaLabel;
	private FactoriaDeTextos factoriaTexto;
	private FactoriaDeBotones factoriadeBotones;
	private FactoriaDeCombos factoriaDeCombos;
	private FactoriaDeTablas factoriaDeTablas;

	public PanelResultadosPruebasLaboratorio() {

		factoriaLabel = new FactoriaDeLabelsGenericos();
		factoriaTexto = new FactoriaDeTextosGenericos();
		factoriadeBotones = new FactoriaDeBotonesGenericos();
		factoriaDeCombos = new FactoriaDeCombosGenericos();
		factoriaDeTablas = new FactoriaDeTablasGenericas();

		lblBuscar = factoriaLabel.crearLabel("Buscar");
		lblNombre = factoriaLabel.crearLabel("Nombre");
		lblApellido = factoriaLabel.crearLabel("Apellido");
		lblCedula = factoriaLabel.crearLabel("C�dula:");
		lblNombrePrueba = factoriaLabel.crearLabel("Nombre prueba:");
		lblResultados = factoriaLabel.crearLabel("Resultado");
		lblFechaResultados = factoriaLabel.crearLabel("Fecha de la prueba:");
		lblHoraResultados = factoriaLabel.crearLabel("Hora de la prueba");

		comboBuscar = factoriaDeCombos.crearCombo();
		comboBuscar.addItem("Pacientes");

		txtBuscar = factoriaTexto.crearJTextField(15);
		txtNombre = factoriaTexto.crearJTextField();
		txtApellido = factoriaTexto.crearJTextField();
		txtCedula = factoriaTexto.crearJTextField();
		txtNombrePrueba = factoriaTexto.crearJTextField();
		txtFechaResultados = factoriaTexto.crearJTextField();
		txtHoraResultados = factoriaTexto.crearJTextField();

		txtNombre.setEditable(false);
		txtApellido.setEditable(false);
		txtCedula.setEditable(false);
		txtNombrePrueba.setEditable(false);
		txtFechaResultados.setEditable(false);
		txtHoraResultados.setEditable(false);

		btnBuscar = factoriadeBotones.crearBoton("Buscar");
		btnEntregar = factoriadeBotones.crearBoton("Entregar resultados");

		pnlBuscador = new JPanel();
		pnlBuscador.setBounds(362, 5, 652, 33);
		pnlBuscador.add(lblBuscar);
		pnlBuscador.add(comboBuscar);
		pnlBuscador.add(txtBuscar);
		pnlBuscador.add(btnBuscar);
		pnlBuscador.add(btnEntregar);

		tablaResultados = factoriaDeTablas.crearTabla();

		scrollTabla = new JScrollPane(tablaResultados);
		scrollTabla.setBounds(362, 49, 660, 402);

		pnlDatosPruebas = new JPanel(new GridLayout(6, 2));
		pnlDatosPruebas.setBounds(10, 49, 342, 120);
		pnlDatosPruebas.add(lblNombre);
		pnlDatosPruebas.add(txtNombre);
		pnlDatosPruebas.add(lblApellido);
		pnlDatosPruebas.add(txtApellido);
		pnlDatosPruebas.add(lblCedula);
		pnlDatosPruebas.add(txtCedula);
		pnlDatosPruebas.add(lblNombrePrueba);
		pnlDatosPruebas.add(txtNombrePrueba);
		pnlDatosPruebas.add(lblFechaResultados);
		pnlDatosPruebas.add(txtFechaResultados);
		pnlDatosPruebas.add(lblHoraResultados);
		pnlDatosPruebas.add(txtHoraResultados);
		setLayout(null);

		pnlResultado = new JPanel();
		pnlResultado.setBounds(10, 170, 343, 299);
		pnlResultado.setLayout(null);

		lblResultados.setBounds(10, 11, 70, 14);
		pnlResultado.add(lblResultados);

		scrollResultados = new JScrollPane();
		scrollResultados.setBounds(90, 17, 243, 271);
		pnlResultado.add(scrollResultados);
		txtResultados = new JTextArea();
		scrollResultados.setViewportView(txtResultados);
		txtResultados.setEditable(false);

		add(pnlBuscador);
		add(scrollTabla);
		add(pnlDatosPruebas);
		add(pnlResultado);

	}
}
