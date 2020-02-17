package pe.uni.aprendiendojava.service;

/**
 *
 * @author Gustavo Coronel
 */
public class Clase02 extends Clase01 {

  public Clase02() {
    super("Gustavo");
  }
  
  @Override
  public double calcVenta(double precio, int cantidad) {
    double venta = super.calcVenta(precio, cantidad);
    venta = venta * 1.18;
    return venta;
  }

  public int sumar(int n1, int n2) {
    return (n1 + n2);
  }

}
