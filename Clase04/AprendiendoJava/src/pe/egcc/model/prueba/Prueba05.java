package pe.egcc.model.prueba;

import java.util.ArrayList;
import java.util.List;
import pe.egcc.domain.Producto;

/**
 *
 * @author Gustavo Coronel
 * @email gcoronelc@gmail.com
 * @blog wwww.desarrollasoftware.com
 */
public class Prueba05 {
  
  public static void main(String[] args) {
    // Lista generica, es de tipo Object
    List lista = new ArrayList();
  
    lista.add(3456);
    lista.add(657.89);
    lista.add("Vamos a ver futbol mundial.");
    lista.add(new Producto("Papaya", 6.8));
    lista.add('G');
    
    // Recoriido indexado
    System.out.println("Recoriido indexado");
    for (int i = 0; i < lista.size(); i++) {
      Object o = lista.get(i);
      System.out.println(o);
    }
    
    lista.add(1, new Producto("Chirimolla", 9.0));
    
    // Recoriido tipo colección
    System.out.println("\n\nRecoriido tipo colección");
    for (Object o : lista) {
      System.out.println(o);
    }
    
  
  }
}
