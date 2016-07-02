package uni.sistemas.controller;

import uni.sistemas.entity.Empleado;
import uni.sistemas.model.EmpleadoModel;

public class EmpleadoController {

	// variable de instancia
	EmpleadoModel model;

	// constructor
	public EmpleadoController() {
		model = new EmpleadoModel();
	}

	// metodo de negocio
	public String calcularSueldo(Empleado x) {
		return model.procesarDatos(x);
	}
}
