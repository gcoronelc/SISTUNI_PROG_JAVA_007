package uni.sistemas.controller;

import uni.sistemas.entity.Pedido;
import uni.sistemas.model.PedidoModel;

public class PedidoController {

	// variable de instancia de la clase PedidoModel
	PedidoModel model;
	// constructor

	public PedidoController() {
		// crear objeto model
		model = new PedidoModel();
	}

	// metodo de negocio
	public void calcularPedido(Pedido x) {
		model.procesarPedido(x);
	}

}
