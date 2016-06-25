package pe.egcc.ventaapp.service;

import pe.egcc.ventaapp.dto.ItemDto;

/**
 *
 * @author Gustavo Coronel
 * @email gcoronelc@gmail.com
 * @blog wwww.desarrollasoftware.com
 */
public class BoletaService extends CompAbstract{

  @Override
  public ItemDto[] procesar(double total) {
    // variables
    double servicio, totalGeneral;
    // Calculos
    servicio = total * SERVICIO;
    totalGeneral = total + servicio;
    // Respuesta
    ItemDto[] repo = {
      new ItemDto("Total", total),
      new ItemDto("Servicio", servicio),
      new ItemDto("Total General", totalGeneral)
    };
    return repo;  
  }
  
}
