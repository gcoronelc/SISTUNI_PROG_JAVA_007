package pe.egcc.service;

/**
 *
 * @author Gustavo Coronel
 * @email gcoronelc@gmail.com
 * @blog wwww.desarrollasoftware.com
 */
public class MateService {

  public int mayor(int n1, int n2) {
    int m = (n1 > n2) ? n1 : n2;
    return m;
  }

  public int mayor(int n1, int n2, int n3) {
    int m = (n1 > n2) ? n1 : n2;
    m = (m > n3) ? m : n3;
    return m;
  }
  
  public int mayor(int n1, int n2, int n3, int n4) {
    int m = (n1 > n2) ? n1 : n2;
    m = (m > n3) ? m : n3;
    m = (m > n4) ? m : n4;
    return m;
  }
  
  public int mayor(int n1, int n2, int n3, int n4, int n5) {
    int m = (n1 > n2) ? n1 : n2;
    m = (m > n3) ? m : n3;
    m = (m > n4) ? m : n4;
    m = (m > n5) ? m : n5;
    return m;
  }

}
