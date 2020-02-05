package pe.uni.pedidoapp.service;

/**
 *
 * @author Gustavo Coronel
 * @blog gcoronelc.blogspot.pe
 * @youtube youtube.com/c/DesarrollaSoftware
 */
public class PedidoService {
  
  /**
   * Calcula el impuesto del pedido.
   * @param importe Importe del pedido.
   * @return Retorna el valor del impuesto.
   */
  public double calcImpuesto(double importe){
    // Variables
    double impuesto;
    // Proceso
    impuesto = importe * 0.18;
    // Reporte
    return impuesto;
  }
  
  public double calcTotal(double importe){
    // Variables
    double total;
    // Proceso
    total = importe + calcImpuesto(importe);
    // Reporte
    return total;
  }
  
}
