package pe.uni.aprendiendojava.service;

/**
 *
 * @author Gustavo Coronel
 */
public class Clase05 {

  public static void main(String[] args) {
    
    Clase02 obj = new Clase02();
    
    String msg = "Compatible con ";
    String msg1 = msg + "Object: " + ((obj instanceof Object)?"SI":"NO");
    String msg2 = msg + "Clase01: " + ((obj instanceof Clase01)?"SI":"NO");
    String msg3 = msg + "Clase02: " + ((obj instanceof Clase02)?"SI":"NO");
    String msg4 = msg + "Clase03: " + ((obj instanceof Clase03)?"SI":"NO");
    String msg5 = msg + "Clase04: " + ((obj instanceof Clase04)?"SI":"NO");

    System.out.println(msg1);
    System.out.println(msg2);
    System.out.println(msg3);
    System.out.println(msg4);
    System.out.println(msg5);
    
  }
  
}
