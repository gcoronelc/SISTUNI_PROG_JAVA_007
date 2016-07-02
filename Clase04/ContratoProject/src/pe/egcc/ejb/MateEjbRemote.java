package pe.egcc.ejb;

import javax.ejb.Remote;

/**
 *
 * @author Gustavo Coronel
 * @email gcoronelc@gmail.com
 * @blog wwww.desarrollasoftware.com
 */
@Remote
public interface MateEjbRemote {

  int sumar(int n1, int n2);
  
}
