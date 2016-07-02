package adminapp.service;

/**
 * @author Luis Checa Alama
 * Clase Servicio:  Permite Calcular el pago mensual de servicios
 */
public class ServicioService extends TipoAbstract{
    @Override
    public double calcular (double xnum1,double xnum2,double xnum3,double xnum4){
        // variables
        double sumserv=0.0;
        //proceso
        sumserv=xnum1+xnum2+xnum3+xnum4;
        //salida
        return(sumserv);    
    }
}
