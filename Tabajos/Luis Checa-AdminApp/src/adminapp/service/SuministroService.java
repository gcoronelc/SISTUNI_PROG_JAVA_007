package adminapp.service;

/**
 * @author Luis Checa Alama
 * Clase Suministro : Permite Calcular el pago mensual de materiales de oficina
 */
public class SuministroService extends TipoAbstract {
        @Override
    public double calcular (double xnum1,double xnum2,double xnum3,double xnum4){
        //variables
        double sumsumi=0.0;
        //proceso
        sumsumi=xnum1+xnum2+xnum3;
        //salida
        return(sumsumi);    
    }
    
}
