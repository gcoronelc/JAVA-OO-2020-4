package pe.uni.aprendiendojava.prueba;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import pe.uni.aprendiendojava.model.ProductoModel;

/**
 *
 * @author Gustavo Coronel
 */
public class Prueba15 {
  
  public static void main(String[] args) {

    // Creación de la lista
    Set<String> lista = new HashSet<>();
    lista.add("PAPAS");
    lista.add("CAMOTES");
    lista.add("LIMONES");
    lista.add("PESCADO");
    lista.add("CEBOLLA");
    lista.add("CEBOLLA");

    // Sin ordenar
    for (String dato : lista) {
      System.out.println(dato);
    }

    
  }
  
}
