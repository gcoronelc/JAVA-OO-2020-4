package pe.uni.buensabor.prueba;

import pe.uni.buensabor.model.ItemModel;
import pe.uni.buensabor.service.CompAbstract;
import pe.uni.buensabor.service.CompFactory;

/**
 *
 * @author Gustavo Coronel
 */
public class Prueba02 {

  public static void main(String[] args) {
    // Dato
    double total = 5678;
    // Proceso
    CompAbstract obj = CompFactory.getService(CompFactory.COMP_BOLETA);
    ItemModel[] repo = obj.procesar(total);
    // Reporte
    for (ItemModel model : repo) {
      System.out.println(model);
    }
  }
  
}
