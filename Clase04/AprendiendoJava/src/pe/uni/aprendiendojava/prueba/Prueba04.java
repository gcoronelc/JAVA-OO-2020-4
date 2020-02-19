package pe.uni.aprendiendojava.prueba;

import pe.uni.aprendiendojava.service.Clase01;
import pe.uni.aprendiendojava.service.Clase02;
import pe.uni.aprendiendojava.service.Clase03;

/**
 *
 * @author Gustavo Coronel
 */
public class Prueba04 {

  public static void main(String[] args) {
    
    Clase01 objA = new Clase02();
    Object objB = objA;
    Clase02 objC = (Clase02) objA;
    Clase03 objD = null;
    if( objA instanceof Clase03){
      objC = (Clase03) objA;
    } else {
      System.out.println("No hay compatibilidad entre Clase03 hacia Clase02.");
    }
    
  }
  
}
