package pe.uni.aprendiendojava.prueba;

import com.sun.imageio.plugins.jpeg.JPEG;
import java.util.Arrays;

/**
 *
 * @author Gustavo Coronel
 */
public class Prueba10 {

  
  public static void main(String[] args) {
    
    int[] vector = {13,65,8,43,23,76,65,32};

    Arrays.sort(vector);
    
    for (int i = 0; i < vector.length; i++) {
      int valor = vector[i];
      System.out.println(valor);
    }
    
    System.out.println("-------------");
    
    for (int i = vector.length -1; i >= 0; i--) {
      int valor = vector[i];
      System.out.println(valor);
    }
    
  }
  
}
