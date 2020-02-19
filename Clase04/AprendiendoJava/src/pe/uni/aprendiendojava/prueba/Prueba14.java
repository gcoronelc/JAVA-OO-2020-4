package pe.uni.aprendiendojava.prueba;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import pe.uni.aprendiendojava.model.ProductoModel;

/**
 *
 * @author Gustavo Coronel
 */
public class Prueba14 {
  
  public static void main(String[] args) {

    // Creación de la lista
    List<ProductoModel> lista = new ArrayList<>();
    lista.add(new ProductoModel("PAPAS", 5));
    lista.add(new ProductoModel("CAMOTES", 6));
    lista.add(new ProductoModel("LIMONES", 10));
    lista.add(new ProductoModel("PESCADO", 7));
    lista.add(new ProductoModel("CEBOLLA", 8));

    // Sin ordenar
    for (ProductoModel model : lista) {
      System.out.println(model);
    }

    // Ordenar
    lista.sort(new Comparator<ProductoModel>() {
      @Override
      public int compare(ProductoModel o1, ProductoModel o2) {
        return o1.getNombre().compareTo(o2.getNombre());
      }
    });
    
    
    // lista ordenada
    System.out.println("---------------");
    for (ProductoModel model : lista) {
      System.out.println(model);
    }
    
  }
  
}
