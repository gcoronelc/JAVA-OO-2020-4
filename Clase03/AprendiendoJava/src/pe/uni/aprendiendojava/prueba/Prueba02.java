package pe.uni.aprendiendojava.prueba;

import pe.uni.aprendiendojava.service.Clase01;
import pe.uni.aprendiendojava.service.Clase02;

/**
 *
 * @author Gustavo Coronel
 */
public class Prueba02 {

  public static void main(String[] args) {
    Clase01 obj = new Clase02();
    double venta = obj.calcVenta(100, 10);
    System.out.println("Venta: " + venta);
  }
}
