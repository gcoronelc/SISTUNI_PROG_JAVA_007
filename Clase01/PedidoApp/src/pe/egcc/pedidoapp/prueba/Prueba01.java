package pe.egcc.pedidoapp.prueba;

import pe.egcc.pedidoapp.service.PedidoService;


/**
 *
 * @author Gustavo Coronel
 * @email gcoronelc@gmail.com
 * @blog wwww.desarrollasoftware.com
 */
public class Prueba01 {
  
  public static void main(String[] args) {
    // Dato
    double importe = 4567.34;
    // Proceso
    PedidoService service = new PedidoService();
    double impuesto = service.calcImpuesto(importe);
    double total = service.calcTotal(importe);
    // Reporte
    System.out.println("Importe: " + importe);
    System.out.println("Impuesto: " + impuesto);
    System.out.println("Total: " + total);
  }
  
}
