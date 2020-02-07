package aprendiendojava.prueba;

import aprendiendojava.model.ProductoModel;

/**
 *
 * @author Gustavo Coronel
 */
public class Prueba05 {
  
  public static void main(String[] args) {
    
    ProductoModel model;
    model = new ProductoModel("Causa Ferreñafana", 2000, 50.0, true);
    
    System.out.println("Nombre: " + model.getNombre());
    System.out.println("Stock: " + model.getStock());
    System.out.println("Precio: " + model.getPrecio());
    System.out.println("Activo: " + model.isActivo());
    
  }
  
}
