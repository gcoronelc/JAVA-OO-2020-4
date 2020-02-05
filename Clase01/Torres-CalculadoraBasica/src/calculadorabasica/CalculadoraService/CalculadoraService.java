/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadorabasica.CalculadoraService;

/**
 *
 * @author Alumno
 */
public class CalculadoraService {

  public double sumaCalc(double num1, double num2) {
    double suma;
    suma = num1 + num2;
    return suma;
  }

  public double restaCalc(double num1, double num2) {
    double resta;
    resta = num1 - num2;
    return resta;
  }

  public double multiplicacionCalc(double num1, double num2) {
    double multiplicacion;
    multiplicacion = num1 * num2;
    return multiplicacion;
  }

  public double divisionCalc(double num1, double num2) {
    double division;
    division = num1 / num2;
    return division;
  }

}
