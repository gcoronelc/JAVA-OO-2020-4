package pe.uni.pagoapp.service;

import pe.uni.pagoapp.model.PagoModel;

public class PagoService {
    public PagoModel procesar(PagoModel model){
        //Variables
        double ingreso,renta,neto;
        //Proceso
        ingreso=model.getHorasDia() * model.getDias() * model.getPagoHora();
        renta=0.0;
        if(ingreso>1500.0)
            renta=ingreso*0.08;
        neto=ingreso-renta;
        //Reporte
        model.setIngreso(ingreso);
        model.setRenta(renta);
        model.setNeto(neto);
        return model;
    }
}
