package pe.uni.aprendiendojava.prueba;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Gustavo Coronel
 */
public class Prueba16 {

  public static void main(String[] args) {
    
    Map<String, Object> datos = new HashMap<>();
    
    datos.put("Curso", "Curso de Java Orientado a ]Objetos");
    datos.put("Profesor", "Curso de Java Orientado a ]Objetos");
    datos.put("Lugar", "UNI");
    datos.put("Vacantes", 20);
    datos.put("Inicio", "15/MAR/2020");
    
    
    Set<String> claves = datos.keySet();
    for (String clave : claves) {
      System.out.println(clave + " - " + datos.get(clave).toString());
    }
    
  }
  
}
