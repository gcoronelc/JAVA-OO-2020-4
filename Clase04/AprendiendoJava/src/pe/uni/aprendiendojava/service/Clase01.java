package pe.uni.aprendiendojava.service;

/**
 *
 * @author Gustavo Coronel
 */
public class Clase01 {

  /**
   * Constructor por defecto.
   */
  public Clase01() {
    System.out.println("Hola desde Clase01");
  }
  
  /**
   * Constructor adicional
   * 
   * @param nombre Nombre de la persona
   */
  public Clase01(String nombre) {
    System.out.println("Hola " + nombre + " desde Clase01");
  }
   
  public double calcVenta(double precio, int cantidad){
    return (precio*cantidad);
  }
  
}
