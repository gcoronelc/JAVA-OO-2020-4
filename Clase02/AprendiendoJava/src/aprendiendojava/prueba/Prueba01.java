package aprendiendojava.prueba;

import aprendiendojava.model.ProductoModel;

/**
 *
 * @author Gustavo Coronel
 */
public class Prueba01 {

  public static void main(String[] args) {
    
    ProductoModel model = new ProductoModel();
    model.setNombre("Televisor");
    model.setStock(500);
    model.setPrecio(4000.0);
    model.setActivo(true);
    
    System.out.println("Nombre: " + model.getNombre());
    System.out.println("Stock: " + model.getStock());
    System.out.println("Precio: " + model.getPrecio());
    System.out.println("Activo: " + model.isActivo());
    
  }
  
}
