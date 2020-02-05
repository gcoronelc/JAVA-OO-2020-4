package pe.uni.pedidoapp.prueba;

import java.util.Scanner;
import pe.uni.pedidoapp.service.PedidoService;

/**
 *
 * @author Gustavo Coronel
 * @blog gcoronelc.blogspot.pe
 * @youtube youtube.com/c/DesarrollaSoftware
 */
public class Prueba01 {

  public static void main(String[] args) {
    // Variables
    double importe, impuesto, total;
    Scanner scanner = new Scanner(System.in);
    // Datos
    System.out.print("Importe: ");
    importe = scanner.nextDouble();
    // Proceso
    PedidoService service = new PedidoService();
    impuesto = service.calcImpuesto(importe);
    total = service.calcTotal(importe);
    // Reporte
    System.out.println("REPORTE");
    System.out.println("Impuesto: " + impuesto);
    System.out.println("Total: " + total);
  }

  
}
