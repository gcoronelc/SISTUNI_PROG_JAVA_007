/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.egcc.pagoApp.service;

import pe.egcc.pagoApp.dto.PagoDto;

/**
 *
 * @author Alumno
 */
public class PagoService {
    
    public void procesar(PagoDto dto){
        //variables
        double ingresos, renta, neto;
        //Proceso
        ingresos=dto.getHorasDias()*dto.getDias()*dto.getPagoHora();       
        renta=0.0;
        if(ingresos> 1500){
            renta=ingresos*0.08;
        }
        neto=  ingresos - renta;
        //Salida
        dto.setIngresos(ingresos);
        dto.setRenta(renta);
        dto.setNeto(neto);
        
        
        
        
        
    }
    
}
