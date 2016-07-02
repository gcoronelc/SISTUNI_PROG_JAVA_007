package adminapp.service;
import adminapp.dto.Inicializacion;
/**
 *
 * @author Luis Checa Alama
 * Clase Renumeracion :Permite Calcular el pago mensual de renumeraciones
 */
public class RenumeracionService extends TipoAbstract{
  
    @Override
    public double calcular (double xnum1,double xnum2,double xnum3,double xnum4){
        //variables
        double sumrem=0.0;
        //proceso
        sumrem=xnum1+xnum2+xnum3+xnum4;       
        //salida
        return(sumrem);
    }
}  