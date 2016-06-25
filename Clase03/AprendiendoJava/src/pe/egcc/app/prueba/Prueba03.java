package pe.egcc.app.prueba;

import pe.egcc.app.model.Clase1;
import pe.egcc.app.model.Clase2;
import pe.egcc.app.model.Clase3;
import pe.egcc.app.model.Clase4;

/**
 *
 * @author Gustavo Coronel
 * @email gcoronelc@gmail.com
 * @blog wwww.desarrollasoftware.com
 */
public class Prueba03 {

  public static void main(String[] args) {
    Clase2 obj = new Clase2();
    
    // Caso 1
    System.out.println("Compatibilidad de obj (Caso 1):");
    System.out.println("Object: " + ((obj instanceof Object)?"SI":"NO"));
    System.out.println("Clase1: " + ((obj instanceof Clase1)?"SI":"NO"));
    System.out.println("Clase2: " + ((obj instanceof Clase2)?"SI":"NO"));
    System.out.println("Clase3: " + ((obj instanceof Clase3)?"SI":"NO"));
    System.out.println("Clase4: " + ((obj instanceof Clase4)?"SI":"NO"));
    
    // Caso 2
    System.out.println("Compatibilidad de obj (Caso 2):");
    System.out.println("Object: " + ((Object.class.isInstance(obj))?"SI":"NO"));
    System.out.println("Clase1: " + ((Clase1.class.isInstance(obj))?"SI":"NO"));
    System.out.println("Clase2: " + ((Clase2.class.isInstance(obj))?"SI":"NO"));
    System.out.println("Clase3: " + ((Clase3.class.isInstance(obj))?"SI":"NO"));
    System.out.println("Clase4: " + ((Clase4.class.isInstance(obj))?"SI":"NO"));
    
  }
  
}
