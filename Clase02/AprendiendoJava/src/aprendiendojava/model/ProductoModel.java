package aprendiendojava.model;

/**
 *
 * @author Gustavo Coronel
 */
public class ProductoModel {

  private String nombre;
  private int stock;
  private double precio;
  private boolean activo;

  // Constructor por defecto
  public ProductoModel() {
    this.nombre = "Frito Trujillano";
    this.stock = 1000;
    this.precio = 20.0;
    this.activo = true;
    System.out.println("Objeto creado.");
  }


  // Constroctor adicional
  public ProductoModel(String nombre, int stock, double precio, boolean activo) {
    this.nombre = nombre;
    this.stock = stock;
    this.precio = precio;
    this.activo = activo;
  }
  

  @Override
  protected void finalize() throws Throwable {
    System.err.println("Chau objeto.");
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public int getStock() {
    return stock;
  }

  public void setStock(int stock) {
    this.stock = stock;
  }

  public double getPrecio() {
    return precio;
  }

  public void setPrecio(double precio) {
    this.precio = precio;
  }

  public boolean isActivo() {
    return activo;
  }

  public void setActivo(boolean activo) {
    this.activo = activo;
  }

}
