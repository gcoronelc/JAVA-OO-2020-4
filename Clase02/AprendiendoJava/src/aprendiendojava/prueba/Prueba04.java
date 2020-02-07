package aprendiendojava.prueba;

import aprendiendojava.service.Mate;

/**
 *
 * @author Gustavo Coronel
 */
public class Prueba04 {

  public static void main(String[] args) {
    Mate mate = new Mate();
    
    System.out.println("8 + 7: " + mate.sumar(8, 7));
    System.out.println("6.0 + 5.0: " + mate.sumar(6.0, 5.0));
  }
  
}
