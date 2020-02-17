package pe.uni.buensabor.service;

import pe.uni.buensabor.model.ItemModel;

/**
 *
 * @author Gustavo Coronel
 */
public class BoletaService extends CompAbstract{

  @Override
  public ItemModel[] procesar(double total) {
    // Variables
    ItemModel[] repo = null;
    double servicio, totalGeneral;
    // Proceso
    servicio = total * 0.10;
    totalGeneral = total + servicio;
    // Reporte
    repo = new ItemModel[]{
      new ItemModel("Total", total),
      new ItemModel("Servicio", servicio),
      new ItemModel("Total General", totalGeneral)
    };
    return repo;
  }

}
