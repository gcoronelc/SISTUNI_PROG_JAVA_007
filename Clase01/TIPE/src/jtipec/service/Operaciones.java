package jtipec.service;

import java.util.Arrays;

public class Operaciones {

  public double calcPromedio(int ... datos) {
    double pro;
    pro = Arrays.stream(datos).average().getAsDouble();
    return pro;
  }

  public int calcMayor(int... datos) {
    int ma;
    Arrays.sort(datos);
    ma = datos[datos.length - 1];
    return ma;
  }

  public int calcMenor(int ... datos) {
    int men;
    men = Arrays.stream(datos).min().getAsInt();
    return men;
  }
}
