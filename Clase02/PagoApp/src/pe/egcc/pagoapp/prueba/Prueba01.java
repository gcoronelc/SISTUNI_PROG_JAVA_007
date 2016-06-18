package pe.egcc.pagoapp.prueba;

import pe.egcc.pagoapp.dto.PagoDto;
import pe.egcc.pagoapp.service.PagoService;

/**
 *
 * @author Gustavo Coronel
 * @email gcoronelc@gmail.com
 * @blog wwww.desarrollasoftware.com
 */
public class Prueba01 {
  
  public static void main(String[] args) {
    // Dato
    PagoDto dto = new PagoDto();
    dto.setHorasDia(5);
    dto.setDias(20);
    dto.setPagoHora(80.0);
    
    // Proceso
    PagoService service = new PagoService();
    service.procesar(dto);
    
    // Reporte
    System.out.println("Ingresos: " + dto.getIngresos());
    System.out.println("Renta: " + dto.getRenta());
    System.out.println("Neto: " + dto.getNeto());
  }
}
