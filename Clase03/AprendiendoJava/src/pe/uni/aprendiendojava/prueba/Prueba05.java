package pe.uni.aprendiendojava.prueba;

import pe.uni.aprendiendojava.spec.IMate;

/**
 *
 * @author Gustavo Coronel
 */
public class Prueba05 {

  public static void main(String[] args) {
    // Datos
    int n1 = 80;
    int n2 = 8;
    // Proceso
    IMate obj = new IMate() {
      @Override
      public int ejecutar(int n1, int n2) {
        return n1*n2;
      }
    };
    int prod = obj.ejecutar(n1, n2);
    // Reporte
    System.out.println("Producto: " + prod);            
  }
  
}
