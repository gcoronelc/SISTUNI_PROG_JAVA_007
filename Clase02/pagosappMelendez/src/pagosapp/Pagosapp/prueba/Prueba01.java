
package pagosapp.Pagosapp.prueba;

import pagosapp.Pagosapp.dto.PagoDto;
import pagosapp.Pagosapp.services.PagosServices;

/**
 *
 * @author Alumno
 */
public class Prueba01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        

        // Dato
        PagoDto dto = new PagoDto();
        dto.setHorasDia(5);
        dto.setDias(20);
        dto.setPagohora(80.0);
        
        //Proceso
        PagosServices service=new PagosServices();
        service.procesar(dto);
        
        //Reporte
        System.out.println("Ingresos: "+dto.getIngresos());
        System.out.println("Renta    : "+dto.getRenta());
        System.out.println("Netoa    : "+dto.getNeto()); 
    }
    
}
