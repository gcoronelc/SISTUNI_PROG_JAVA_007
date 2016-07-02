package pe.egcc.model.prueba;

/**
 *
 * @author Gustavo Coronel
 * @email gcoronelc@gmail.com
 * @blog wwww.desarrollasoftware.com
 */
public class Prueba03 {
  
  public static void main(String[] args) {
    int[] notas = new int[5];
    
   // Recorrido indexado
    System.out.println("Recorrido indexado");
    for (int i = 0; i < notas.length; i++) {
      int nota = notas[i];
      System.out.println(nota);
    }
    
    notas[1] = 50;
    notas[3] = 80;
    // Recorrido tipo colección
    System.out.println("Recorrido tipo colección");
    for (int nota : notas) {
      System.out.println(nota);
    }

  }

  
  
}
