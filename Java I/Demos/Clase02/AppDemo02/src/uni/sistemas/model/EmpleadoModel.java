package uni.sistemas.model;

import uni.sistemas.entity.Empleado;

public class EmpleadoModel {
	// constructor
	public EmpleadoModel() {
		// TODO Auto-generated constructor stub
	}

	// metodo para procesar datos
	public String procesarDatos(Empleado e) {
		// calcular total
		double tot = e.getDias() * e.getHoras() * e.getPago();
		// encapsular tot
		e.setTotal(tot);
		// calcular renta
		double renta = 0;
		if (tot > 1500) {
			renta = tot * 0.08;
		}
		// encapsular renta
		e.setRenta(renta);
		// calcular neto
		e.setNeto(tot - renta);
		String boleta = generaBoleta(e);
		return boleta;
	}

	private String generaBoleta(Empleado e) {
		String xboleta = "Nombre     :" + e.getNombre() + "\n" + 
				         "Dias trab. :" + e.getDias() + "\n" +
				         "Horas trab.:" + e.getHoras() + "\n" +
	                     "Pago x hora:" + e.getPago() + "\n" + 
				         "Total      :" + e.getTotal() + "\n"+
	                     "Renta      :" + e.getRenta() + "\n" + 
				         "Sueldo Neto:" + e.getNeto();

		return xboleta;
	}

}
