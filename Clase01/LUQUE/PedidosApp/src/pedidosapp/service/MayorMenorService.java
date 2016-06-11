package pedidosapp.service;

public class MayorMenorService {

  public double obtenerMayor(double num1, double num2, double num3) {
    double numeroMayor;
    numeroMayor = num1;
    if(numeroMayor < num2){
      numeroMayor = num2;
    }
    if(numeroMayor < num3){
      numeroMayor = num3;
    }
    return numeroMayor;
  }

  public double obtenerMayor(int[] numeros) {
    double numeroMayor = 0;
    int i = 0;

    return numeroMayor;
  }

  public double obtenerMenor(double num1, double num2, double num3) {
    double numeroMenor;
    numeroMenor = 0;
    if (num1 <= num2 && num1 <= num3) {
      numeroMenor = num1;
    } else if (num2 <= num1 && num2 <= num3) {
      numeroMenor = num2;
    } else if (num3 <= num1 && num3 <= num2) {
      numeroMenor = num3;
    }
    return numeroMenor;
  }

  public double obtenerPromedio(double num1, double num2) {
    double promedio;
    promedio = (num1 + num2) / 2;
    return promedio;
  }
}
