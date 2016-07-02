package pe.egcc.ventaapp.service;

import pe.egcc.ventaapp.dto.ItemDto;

public abstract class CompAbstract {
    // constantes
    public static final double IGV=0.18;
    public static final double SERVICIO=0.10;
    
    // definir metodos abstractos

    public abstract ItemDto[] procesar(double total);
}
