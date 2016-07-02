package pe.egcc.ventaapp.util;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

/**
 *
 * @author Gustavo Coronel
 * @email gcoronelc@gmail.com
 * @blog wwww.desarrollasoftware.com
 */
public final class MathUtil {

  private MathUtil() {
  }

  
  public static String decToString(double valor){
    DecimalFormatSymbols simbolos = new DecimalFormatSymbols();
    simbolos.setDecimalSeparator('.');
    simbolos.setGroupingSeparator(',');
    DecimalFormat formateador = new DecimalFormat("#,###.##",simbolos);
    return formateador.format(valor);
  }
  
  public static void main(String[] args) {
    System.out.println("23.567 => " + decToString(23.567));
    System.out.println("4523.567 => " + decToString(4523.567));
  }
  
  

  
}
