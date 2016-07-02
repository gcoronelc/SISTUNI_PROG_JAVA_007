package pe.egcc.ejb;

import javax.ejb.Stateless;

/**
 *
 * @author Gustavo Coronel
 * @email gcoronelc@gmail.com
 * @blog wwww.desarrollasoftware.com
 */
@Stateless
public class MateEjb implements MateEjbRemote {

  @Override
  public int sumar(int n1, int n2) {
    return (n1 + n2);
  }


}
