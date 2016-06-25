package pe.egcc.mateapp.service;

/**
 *
 * @author Gustavo Coronel
 * @email gcoronelc@gmail.com
 * @blog wwww.desarrollasoftware.com
 */
public final class MyMath {

  private MyMath() {
  }

  public static long factorial(int n) {
    long f = 1;
    while (n > 1) {
      f *= n--;
    }
    return f;
  }

  public static int mcd(int n1, int n2) {
    return 0;
  }

  public static int mcm(int n1, int n2) {
    return 0;
  }

  public static String fibonacci(int n) {
    return "";
  }

  public static boolean primo(int n) {
    return false;
  }

}
