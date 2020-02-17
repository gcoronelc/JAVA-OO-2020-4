package pe.uni.aprendiendojava.prueba;

import pe.uni.aprendiendojava.service.RestaService;
import pe.uni.aprendiendojava.service.SumaService;

/**
 *
 * @author Gustavo Coronel
 */
public class Prueba04 {

  public static void main(String[] args) {
    // Datos
    int n1 = 20;
    int n2 = 6;
    // Proceso
    SumaService sumaService = new SumaService();
    RestaService restaService = new RestaService();
    int suma = sumaService.ejecutar(n1, n2);
    int resta = restaService.ejecutar(n1, n2);
    // Reporte
    System.out.println("Num. 1: " + n1);
    System.out.println("Num. 2: " + n2);
    System.out.println("Suma: " + suma);
    System.out.println("Resta: " + resta);
  }
  
}
