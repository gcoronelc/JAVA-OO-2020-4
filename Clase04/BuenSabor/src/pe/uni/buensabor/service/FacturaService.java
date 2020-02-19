package pe.uni.buensabor.service;

import pe.uni.buensabor.model.ItemModel;

/**
 *
 * @author Gustavo Coronel
 */
public class FacturaService extends CompAbstract{

  @Override
  public ItemModel[] procesar(double total) {
    // Variables
    ItemModel[] repo = null;
    double consumo, impuesto, servicio, totalGeneral;
    // Proceso
    consumo = total / 1.18;
    impuesto = total - consumo;
    servicio = total * 0.10;
    totalGeneral = total + servicio;
    // Reporte
    repo = new ItemModel[]{
      new ItemModel("Consumo", consumo),
      new ItemModel("Impuesto", impuesto),
      new ItemModel("Total", total),
      new ItemModel("Servicio", servicio),
      new ItemModel("Total General", totalGeneral)
    };
    return repo;
  }

}
