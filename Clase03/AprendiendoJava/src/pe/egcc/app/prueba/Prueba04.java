package pe.egcc.app.prueba;

import pe.egcc.app.model.Clase1;
import pe.egcc.app.model.Clase2;
import pe.egcc.app.model.Clase3;

/**
 *
 * @author Gustavo Coronel
 * @email gcoronelc@gmail.com
 * @blog wwww.desarrollasoftware.com
 */
public class Prueba04 {
  
  public static void main(String[] args) {
    
    Clase2 bean = new Clase3();
    int suma = bean.sumar(6, 8);
    int resta = bean.restar(6, 8);
    System.out.println("Suma: " + suma);
    System.out.println("Resta: " + resta);
    
  }
  
}
