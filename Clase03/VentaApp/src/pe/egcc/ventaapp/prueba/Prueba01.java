package pe.egcc.ventaapp.prueba;

import pe.egcc.ventaapp.dto.ItemDto;
import pe.egcc.ventaapp.service.BoletaService;
import pe.egcc.ventaapp.service.CompAbstract;
import pe.egcc.ventaapp.service.FacturaService;

/**
 *
 * @author Gustavo Coronel
 * @email gcoronelc@gmail.com
 * @blog wwww.desarrollasoftware.com
 */
public class Prueba01 {
  
  public static void main(String[] args) {
    CompAbstract comp = new BoletaService();
    ItemDto[] repo = comp.procesar(856.70);
    for (ItemDto dto : repo) {
      System.out.println(dto.getConcepto() + " ---> " + dto.getValor());
    }
  }
}
