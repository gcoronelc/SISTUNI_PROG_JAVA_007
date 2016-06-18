package pe.egcc.prueba;

import pe.egcc.service.MateService;

/**
 *
 * @author Gustavo Coronel
 * @email gcoronelc@gmail.com
 * @blog wwww.desarrollasoftware.com
 */
public class Prueba04 {
  
  public static void main(String[] args) {
    MateService service = new MateService();
    System.out.println("Mayor: " + service.mayor(5, 2));
    System.out.println("Mayor: " + service.mayor(5, 2, 8));
    System.out.println("Mayor: " + service.mayor(5, 2, 8, 18));
    System.out.println("Mayor: " + service.mayor(5, 2, 8, 18, 10));
  }
}
