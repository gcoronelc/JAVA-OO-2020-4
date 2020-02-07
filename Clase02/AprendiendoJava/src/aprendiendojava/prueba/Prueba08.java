package aprendiendojava.prueba;

import aprendiendojava.model.Util;
import java.util.Set;

/**
 *
 * @author Gustavo Coronel
 */
public class Prueba08 {
  
  public static void main(String[] args) {
    Set<String> claves = Util.PRECIOS.keySet();
    
    for (String clave : claves) {
      System.out.println(clave + " - " + Util.PRECIOS.get(clave));
    }
  }
  
}
