package pe.uni.buensabor.prueba;

import pe.uni.buensabor.model.ItemModel;
import pe.uni.buensabor.service.BoletaService;
import pe.uni.buensabor.service.CompAbstract;
import pe.uni.buensabor.service.FacturaService;

/**
 *
 * @author Gustavo Coronel
 */
public class Prueba01 {

  public static void main(String[] args) {
    // Dato
    double total = 5678;
    // Proceso
    CompAbstract obj = new FacturaService();
    ItemModel[] repo = obj.procesar(total);
    // Reporte
    for (ItemModel model : repo) {
      System.out.println(model);
    }
  }
  
}
