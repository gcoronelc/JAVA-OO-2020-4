package pe.uni.aprendiendojava.prueba;

import pe.uni.aprendiendojava.service.Clase01;
import pe.uni.aprendiendojava.service.Clase02;

/**
 *
 * @author Gustavo Coronel
 */
public class Prueba03 {

  public static void main(String[] args) {
    
    Clase01 obj = new Clase01();
    
    double venta = obj.calcVenta(100, 10);
    //int suma = obj.sumar(12, 15);
    
    System.out.println("Venta: " + venta);
    //System.out.println("Suma: " + suma);
    
  }
  
}
