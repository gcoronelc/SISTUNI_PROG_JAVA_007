package pe.egcc.app.prueba;

import pe.egcc.app.model.Clase3;

/**
 *
 * @author Gustavo Coronel
 * @email gcoronelc@gmail.com
 * @blog wwww.desarrollasoftware.com
 */
public class Prueba02 {
  
  public static void main(String[] args) {
    // Datos
    int n1 = 34;
    int n2 = 43;
    // Proceso
    Clase3 bean = new Clase3();
    int suma = bean.sumar(n1, n2);
    int resta = bean.restar(n1, n2);
    // Reporte
    System.out.println(n1 + " + " + n2 + " = " + suma);
    System.out.println(n1 + " - " + n2 + " = " + resta);
  }
  
}
