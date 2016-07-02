package pe.egcc.ventaapp.service;

import pe.egcc.ventaapp.dto.ItemDto;

public class BoletaService extends CompAbstract {

    @Override
    public ItemDto[] procesar(double total) {
        // calcular servicio y total
        double servicio, totalGeneral;
        
        servicio= total * SERVICIO;
        totalGeneral = total + servicio;
        // generar boleta
        ItemDto repo[] = {
        // crear objetos
            new ItemDto("Total", total),
            new ItemDto("Servicio(10%)", servicio),
            new ItemDto("Total General", totalGeneral)
    
        };
        return repo;
    }

}
