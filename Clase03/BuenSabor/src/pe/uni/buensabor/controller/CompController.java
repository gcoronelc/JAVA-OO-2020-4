package pe.uni.buensabor.controller;

import pe.uni.buensabor.model.ItemModel;
import pe.uni.buensabor.service.CompFactory;

/**
 *
 * @author Gustavo Coronel
 */
public class CompController {

  public String[] traerTipos() {
    return CompFactory.getTipos();
  }

  public ItemModel[] procesar(String tipo, double total) {
    return CompFactory.getService(tipo).procesar(total);
  }
  
}
