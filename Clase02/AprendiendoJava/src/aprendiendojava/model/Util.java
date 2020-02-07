package aprendiendojava.model;

import java.util.HashMap;
import java.util.Map;

public class Util {

  private Util() {
  }

  // Constantes de CRUD
  public static final String CRUD_NUEVO = "NUEVO";
  public static final String CRUD_EDITAR = "EDITAR";
  public static final String CRUD_ELIMINAR = "ELIMINAR";
  
  
  public static final Map<String,Double> PRECIOS;
  
  static {
    PRECIOS = new HashMap<>();
    PRECIOS.put("Televisor", 4000.0);
    PRECIOS.put("Laptop", 6700.0);
    PRECIOS.put("Refrigeradora", 8300.0);
    PRECIOS.put("Juego de Mesa", 2500.0);
    PRECIOS.put("Televisor", 4500.0);
  }
  
  
  
}
