package pe.uni.aprendiendojava.prueba;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gustavo Coronel
 */
public class Prueba12 {
  
  public static void main(String[] args) {
    List<Integer> lista = new ArrayList<>();
    
    lista.add(16);
    lista.add(18);
    lista.add(20);
    lista.add(12);
    
    // Recorrido indexado
    for (int i = 0; i < lista.size(); i++) {
      System.out.println(lista.get(i));
    }
    
    
    lista.add(17); // Se agrega al ultimo
    lista.add(1, 14); // Se inserta en la posición 1.
    
    // Recorrido tipo colección
    System.out.println("----------------");
    for (Integer dato : lista) {
      System.out.println(dato);
    }
    
    
    
    
  }

}
