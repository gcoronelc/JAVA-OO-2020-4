package pe.uni.pagoapp.prueba;

import pe.uni.pagoapp.model.PagoModel;
import pe.uni.pagoapp.service.PagoService;

public class Prueba01 {
    public static void main(String[] args) {
        //Variables
        PagoModel model=new PagoModel();
        PagoService service=new PagoService();
        //Datos
        model.setHorasDia(6);
        model.setDias(20);
        model.setPagoHora(140);
        //Proceso
        model=service.procesar(model);
        //Reporte
        System.out.println("Ingreso:"+model.getIngreso());
        System.out.println("Renta:"+model.getRenta());
        System.out.println("Neto:"+model.getNeto());
    }
}
