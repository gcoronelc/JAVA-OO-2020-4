package pe.uni.buensabor.service;

/**
 *
 * @author Gustavo Coronel
 */
public class CompFactory {
  
  public static final String COMP_FACTURA = "FACTURA";
  public static final String COMP_BOLETA = "BOLETA";

  private CompFactory() {
  }

  public static final CompAbstract getService(String tipo){
    CompAbstract obj = null;
    switch(tipo){
      case COMP_FACTURA:
        obj = new FacturaService();
        break;
      case COMP_BOLETA:
        obj = new BoletaService();
        break;
    }
    return obj;
  }
  
}
