package pe.egcc.model.prueba;

import pe.egcc.domain.Producto;

/**
 *
 * @author Gustavo Coronel
 * @email gcoronelc@gmail.com
 * @blog wwww.desarrollasoftware.com
 */
public class Prueba04 {
  
  public static void main(String[] args) {
    Producto lista[] = new Producto[5];
    
    // Recorrido indexado
    System.out.println("Recorrido indexado");
    for (int i = 0; i < lista.length; i++) {
      Producto p = lista[i];
      System.out.println(p);
    }
    
    lista[1] = new Producto("Coca Cola",3.5);
    lista[3] = new Producto("Pollo a Olla",16.5);
    
    // Recorrido tipo colección
    System.out.println("Recorrido tipo colección");
    for (Producto p : lista) {
      System.out.println(p);
    }
    
    
  }

  
}
