package pe.egcc.ventaapp.service;

import pe.egcc.ventaapp.dto.ItemDto;

public class BoletaService extends CompAbstract{
  @Override
  public ItemDto[] procesar(double total) {
    // variables
    Double servicio, totalGeneral;
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
