package uni.sistemas.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import uni.sistemas.controller.PedidoController;
import uni.sistemas.entity.Pedido;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;

public class PedidoView extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtProveedor;
	private JTextField txtImporte;
	private JTextArea txtBoleta;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PedidoView frame = new PedidoView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public PedidoView() {
		setTitle(":: CALCULAR PEDIDO ::");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 376, 425);
		contentPane = new JPanel();
		contentPane.setBackground(Color.CYAN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblProveedor = new JLabel("Proveedor");
		lblProveedor.setBounds(33, 39, 70, 14);
		contentPane.add(lblProveedor);

		JLabel lblImporte = new JLabel("Importe");
		lblImporte.setBounds(30, 81, 54, 14);
		contentPane.add(lblImporte);

		txtProveedor = new JTextField();
		txtProveedor.setBounds(113, 36, 171, 20);
		contentPane.add(txtProveedor);
		txtProveedor.setColumns(10);

		txtImporte = new JTextField();
		txtImporte.setBounds(113, 78, 171, 20);
		contentPane.add(txtImporte);
		txtImporte.setColumns(10);

		JButton btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				procesar();
			}
		});
		btnProcesar.setBounds(33, 131, 89, 23);
		contentPane.add(btnProcesar);

		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.setBounds(132, 131, 89, 23);
		contentPane.add(btnLimpiar);

		JButton btnSalir = new JButton("Salir");
		btnSalir.setBounds(231, 131, 89, 23);
		contentPane.add(btnSalir);

		txtBoleta = new JTextArea();
		txtBoleta.setBounds(33, 165, 287, 181);
		contentPane.add(txtBoleta);
	}

	// instanciar objeto de la clase PedidoController
	PedidoController obj = new PedidoController();
	Pedido pe;

	protected void procesar() {
		// crear objeto pe
		pe = new Pedido();
		// asignar valores al objeto pe
		pe.setProveedor(txtProveedor.getText());
		pe.setImporte(Double.parseDouble(txtImporte.getText()));
		// procesar pedido
		obj.calcularPedido(pe);
		// dar formato de notacion comercial
		DecimalFormat formato=new DecimalFormat("#,###.00");
		// ver boleta
		txtBoleta.setText("");
		txtBoleta.append("BOLETA DE PEDIDO\n");
		txtBoleta.append("Proveedor :" + pe.getProveedor() + "\n");
		txtBoleta.append("Importe   :" + formato.format(pe.getImporte()) + "\n");
		txtBoleta.append("Impuesto  :" + formato.format(pe.getImpuesto()) + "\n");
		txtBoleta.append("Total     :" + formato.format(pe.getTotal()) + "\n");

	}
}
