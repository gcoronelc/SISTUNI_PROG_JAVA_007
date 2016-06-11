package pe.egcc.pedidoapp.service;

/**
 *
 * @author Gustavo Coronel
 * @email gcoronelc@gmail.com
 * @blog wwww.desarrollasoftware.com
 */
public class PedidoService {
  
  
  public double calcImpuesto(double importe){
    double impuesto;
    impuesto = importe * 0.18;
    return impuesto;
  }
  
  public double calcTotal( double importe){
    double total;
    total = importe + calcImpuesto(importe);
    return total;
  }
  
}
