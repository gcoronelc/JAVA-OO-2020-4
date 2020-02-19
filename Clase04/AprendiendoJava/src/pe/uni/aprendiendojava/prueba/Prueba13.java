package pe.uni.aprendiendojava.prueba;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Gustavo Coronel
 */
public class Prueba13 {
  
  public static void main(String[] args) {

    // Creación de la lista
    List<Integer> lista = new ArrayList<>();
    lista.add(16);
    lista.add(18);
    lista.add(20);
    lista.add(12);
    lista.add(17);    
    lista.add(14);

    // Sin ordenar
    for (Integer dato : lista) {
      System.out.println(dato);
    }

    // Ordenar
    lista.sort(new Comparator<Integer>() {
      @Override
      public int compare(Integer o1, Integer o2) {
        int n = 1;
        if(o1.intValue() > o2.intValue()){
          n = -1;
        }
        return n;
      }
    });

    // lista ordenada
    System.out.println("---------------");
    for (Integer dato : lista) {
      System.out.println(dato);
    }
    
  }
  
}
