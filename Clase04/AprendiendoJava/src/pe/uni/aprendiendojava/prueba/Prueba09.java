package pe.uni.aprendiendojava.prueba;

/**
 *
 * @author Gustavo Coronel
 */
public class Prueba09 {

  
  public static void main(String[] args) {
    int[][] mat = new int[5][4];

    for (int i = 0; i < mat.length; i++) {
      int[] fila = mat[i];
      String data = "";
      for (int dato : fila) {
        data += dato + "\t";
      }
      System.out.println(data);
    }
  }
  
}
