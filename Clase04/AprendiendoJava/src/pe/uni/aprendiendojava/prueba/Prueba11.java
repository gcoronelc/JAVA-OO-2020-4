package pe.uni.aprendiendojava.prueba;

import com.sun.imageio.plugins.jpeg.JPEG;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 *
 * @author Gustavo Coronel
 */
public class Prueba11 {

  public static void main(String[] args) {

    int[] vector = {13, 65, 8, 43, 23, 76, 65, 32};

    IntStream stream = Arrays.stream(vector);

    //System.out.println("Maximo: " + stream.max().getAsInt());
    //System.out.println("Minimo: " + stream.min().getAsInt());
    System.out.println("Promedio: " + stream.average().getAsDouble());

  }

}
