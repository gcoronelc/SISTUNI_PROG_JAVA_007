package pe.egcc.model.prueba;

/**
 *
 * @author Gustavo Coronel
 * @email gcoronelc@gmail.com
 * @blog wwww.desarrollasoftware.com
 */
public class Prueba02 {
  
  public static void main(String[] args) {
    // Caso 1
    int a = 15;
    long b = a;
    System.out.println("a = " + a);
    System.out.println("b = " + b);
    // Caso 2
    long m = 1000;
    int n = (int) m;
    System.out.println("m = " + m);
    System.out.println("n = " + n);
    // Caso 3
    long p = 56821634569736L;
    int q = (int) p;
    System.out.println("p = " + p);
    System.out.println("q = " + q);
  }
  
}
