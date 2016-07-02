
package pe.egcc.ventaapp.controller;

import pe.egcc.ventaapp.dto.ItemDto;
import pe.egcc.ventaapp.service.BoletaService;
import pe.egcc.ventaapp.service.CompAbstract;
import pe.egcc.ventaapp.service.FacturaService;

/**
 *
 * @author Luis Checa Alama
 */
public class VentaController {
 
  public static final String COMP_FACTURA = "FACTURA";
  public static final String COMP_BOLETA = "BOLETA";
  
  
  public String[] getTipos(){
    String[] tipos = {COMP_FACTURA,COMP_BOLETA};
    return tipos;
  }

  public ItemDto[] procesar(String tipo, double total) {
    CompAbstract comp = null;
    switch(tipo){
      case COMP_FACTURA:
        comp = new FacturaService();
        break;
      case COMP_BOLETA:
        comp = new BoletaService();
        break;
    }
    return comp.procesar(total);
  }
    
    
    
    
    
    
    
}
