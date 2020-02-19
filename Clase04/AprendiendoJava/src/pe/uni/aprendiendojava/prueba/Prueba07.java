package pe.uni.aprendiendojava.prueba;

/**
 *
 * @author Gustavo Coronel
 */
public class Prueba07 {

  public static void main(String[] args) {
    
    // Por ser String una clase
    // el valor mpor defecto de cada
    // elemento es null.
    String nombres[] = new String[5];
    
    // Recorrido tipo colección
    for (String nombre : nombres) {
      System.out.println(nombre);
    }
    
  }
  
}
