package pe.uni.apppromedio.controller;

import pe.uni.mate.MateService;

public class PromedioController {

  public int promedio(int num1, int num2) {
    MateService service = new MateService();
    return service.promedio(num1, num2);
  }


  
  
}
