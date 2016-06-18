/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pagosapp.Pagosapp.services;

import pagosapp.Pagosapp.dto.PagoDto;

/**
 *
 * @author Alumno
 */
public class PagosServices {
    
    public void procesar (PagoDto dto){
        //varialbles
        double ingresos, renta, neto;
        //Procesos
        ingresos = dto.getHorasDia() * dto.getDias() * dto.getPagohora();
        renta = 0.0;
        if (ingresos>1500.0){
            renta=ingresos*0.08;
        }
        neto=ingresos - renta;
        //salida
        dto.setIngresos(ingresos);
        dto.setRenta(renta);
        dto.setNeto(neto);
    }
    
}
