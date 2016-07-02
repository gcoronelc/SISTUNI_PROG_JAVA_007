package pe.egcc.model.prueba;

import pe.egcc.model.espec.IDemo3;
import pe.egcc.model.impl.ClaseB;

/**
 *
 * @author Gustavo Coronel
 * @email gcoronelc@gmail.com
 * @blog wwww.desarrollasoftware.com
 */
public class Prueba01 {
  
  public static void main(String[] args) {
    ClaseB bean = new ClaseB();
    bean.accion1();
    
    IDemo3 bean1 = bean;
    bean1.accion1();
  }
}
