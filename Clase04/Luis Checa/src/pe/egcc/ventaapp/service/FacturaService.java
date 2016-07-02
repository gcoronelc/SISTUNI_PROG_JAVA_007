package pe.egcc.ventaapp.service;

import pe.egcc.ventaapp.dto.ItemDto;
 
public class FacturaService extends CompAbstract{

  @Override
  public ItemDto[] procesar(double total) {
    // variables
    double importe, impuesto, servicio, totalGeneral;
    // Calculos
    importe = total / (1 + IGV);
    impuesto = total - importe;
    servicio = total * SERVICIO;
    totalGeneral = total + servicio;
    // Respuesta
    ItemDto[] repo = {
      new ItemDto("Importe", importe),
      new ItemDto("Impuesto", impuesto),
      new ItemDto("Total", total),
      new ItemDto("Servicio", servicio),
      new ItemDto("Total General", totalGeneral)
    };
    return repo;  
  }
  
}
