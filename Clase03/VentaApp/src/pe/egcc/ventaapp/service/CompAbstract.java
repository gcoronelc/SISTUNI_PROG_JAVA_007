package pe.egcc.ventaapp.service;

import pe.egcc.ventaapp.dto.ItemDto;

/**
 *
 * @author Gustavo Coronel
 * @email gcoronelc@gmail.com
 * @blog wwww.desarrollasoftware.com
 */
public abstract class CompAbstract {
  
  public static final double IGV = 0.18;
  public static final double SERVICIO = 0.10;
  
  public abstract ItemDto[] procesar(double total);
  
}
