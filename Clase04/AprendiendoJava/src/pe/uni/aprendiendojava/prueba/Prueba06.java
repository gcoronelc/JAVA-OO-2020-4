package pe.uni.aprendiendojava.prueba;

/**
 *
 * @author Gustavo Coronel
 */
public class Prueba06 {

  public static void main(String[] args) {
    
    // Por ser int un tipo prmitivo
    // el valor mpor defecto de cada
    // elemento es cero.
    int notas[] = new int[5];
    
    // Recorrido tipo colección
    for (int nota : notas) {
      System.out.println(nota);
    }
    
  }
  
}
