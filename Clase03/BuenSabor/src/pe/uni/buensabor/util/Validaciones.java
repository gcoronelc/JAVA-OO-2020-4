package pe.uni.buensabor.util;

import java.awt.Color;
import javax.swing.JTextField;

/**
 *
 * @author Gustavo Coronel
 */
public class Validaciones {
  
  
  public static boolean isDouble(String dato){
    boolean rpta;
    try {
      double x = Double.parseDouble(dato);
      rpta = true;
    } catch (Exception e) {
      rpta = false;
    }
    return rpta;
  }
  
  public static boolean isPositive(double dato){
    boolean rpta = true;
    if( dato <= 0 ){
      rpta = false;
    }
    return rpta;
  }
  

  public static boolean isDoublePositivo(JTextField control){
    control.setBackground(Color.white);
    if( ! Validaciones.isDouble(control.getText())){
      control.setBackground(Color.PINK);
      return false;
    }
    double total = Double.parseDouble(control.getText());
    if( ! Validaciones.isPositive(total)){
      control.setBackground(Color.PINK);
      return false;
    }
    return true;
  }
  
}
