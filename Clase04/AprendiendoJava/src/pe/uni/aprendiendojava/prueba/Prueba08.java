package pe.uni.aprendiendojava.prueba;

/**
 *
 * @author Gustavo Coronel
 */
public class Prueba08 {

  public static void main(String[] args) {

    int[][] mat = {
      {13, 76, 23, 45, 76, 23, 54},
      {76, 43, 56, 76},
      {43, 54, 23, 87, 23, 45},
      {54, 23, 66, 87, 56},
      {12, 87, 34}
    };

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
