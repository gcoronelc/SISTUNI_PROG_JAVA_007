package adminapp.prueba;

import adminapp.dto.Inicializacion;
import adminapp.service.RenumeracionService;
import adminapp.service.ServicioService;
import adminapp.service.SuministroService;
import adminapp.service.TipoAbstract;

/**
 *
 * @author Luis Checa Alama
 */
public class Prueba01 {
    
    public static void main(String[] args) {

           //creando el objeto
           Inicializacion dto = new Inicializacion();
        
           //proceso 
           TipoAbstract tipo1 = new ServicioService();
           dto.setTotal1(tipo1.calcular(2500.00, 790.00, 660.00, 300.00));

           TipoAbstract tipo2 = new SuministroService();        
           dto.setTotal2(tipo2.calcular(800.00,985.00, 180.00, 0.0));

           TipoAbstract tipo3 = new RenumeracionService();
           dto.setTotal3(tipo3.calcular(10200.00,4200.00,7200.00,3000.00));

           dto.setTottalg(dto.getTotal1()+dto.getTotal2()+dto.getTotal3() );

        // reporte
        System.out.println("Total mesual de Servicio                 :  " + dto.getTotal1());
        System.out.println("Total mesual de Suministro             :  " + dto.getTotal2());
        System.out.println("Total mesual de Renumeraciones  :  " + dto.getTotal3());        
        System.out.println(" Total General                                    :  " + dto.getTottalg());   
    }
   
}
