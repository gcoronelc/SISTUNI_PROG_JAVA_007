package pe.egcc.ventaapp.service;

import pe.egcc.ventaapp.dto.ItemDto;

public class FacturaService extends CompAbstract {

    @Override
    public ItemDto[] procesar(double total) {
        // calcular servicio,igv,consumo y total
        double importe, impuesto, servicio, totalGeneral;
        
        importe = total / (1 + IGV);
        impuesto = total - importe;
        servicio = total * SERVICIO;
        totalGeneral = total + servicio;
        // generar factura
        ItemDto repo[] = {
        // crear objetos
            new ItemDto("Importe", importe),
            new ItemDto("Impuesto", impuesto),
            new ItemDto("Total", total),
            new ItemDto("Servicio(10%)", servicio),
            new ItemDto("Total General", totalGeneral)
        };
    
        return repo;

    }

}
