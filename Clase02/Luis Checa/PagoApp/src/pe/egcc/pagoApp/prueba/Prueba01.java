/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.egcc.pagoApp.prueba;

import pe.egcc.pagoApp.dto.PagoDto;
import pe.egcc.pagoApp.service.PagoService;

/**
 *
 * @author Alumno
 */
public class Prueba01 {
    
    public static void main(String[] args) {
        //dato
        PagoDto dto = new PagoDto();
        dto.setHorasDias(5);
        dto.setDias(20);
        dto.setPagoHora(80.0);
        //Proceso
        PagoService  service = new PagoService();
        service.procesar(dto);
        //Reporte
        System.out.println("Ingresos :" + dto.getIngresos());
        System.out.println("Renta : " + dto.getRenta());
        System.out.println("Neto :" + dto.getNeto());
    }
}
