package uni.sistemas.model;

import uni.sistemas.entity.Pedido;

public class PedidoModel {

	// constructor
	public PedidoModel() {

	}

	// metodo para procesar dato
	public void procesarPedido(Pedido pe) {
		// variables
		double igv = pe.getImporte() * 0.18;
		double tot = pe.getImporte() + igv;
		// encapsular
		pe.setImpuesto(igv);
		pe.setTotal(tot);
	}

}