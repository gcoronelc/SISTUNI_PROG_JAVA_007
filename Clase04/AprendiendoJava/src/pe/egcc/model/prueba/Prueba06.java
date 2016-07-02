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
public class Prueba06 {
  
  public static void main(String[] args) {
    // Lista tipificada
    List<Producto> lista = new ArrayList<>();
    
    lista.add(new Producto("Tomate", 3.8));
    lista.add(new Producto("Mango", 6.8));
    lista.add(new Producto("Coca cola", 10.0));
    lista.add(new Producto("Cristal", 20.0));
    lista.add(new Producto("Mandarina", 5.8));
    lista.add(new Producto("Pepino", 2.8));
    
    for (Producto p : lista) {
      System.out.println(p);
    }
    
    
    
  }
}
