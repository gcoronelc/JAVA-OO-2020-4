
package pe.uni.impuestoalarenta.controller;

import pe.uni.impuestoalarenta.service.ImpuestoalarentaService;

public class ImpuestoalarentaController {
    public ImpuestoalarentaService service;

    public ImpuestoalarentaController() {
        this.service = new ImpuestoalarentaService();
    }
    
    public double deduccion4ta (double ingreso4ta){
        return service.deduccion4ta(ingreso4ta);
    }
    
    public double rentaneta4ta (double ingreso4ta){
        return service.rentaneta4ta(ingreso4ta);
    }
    
    public double totalrenta4 (double ingreso4ta,double otingreso4ta){
        return service.totalrenta4(ingreso4ta, otingreso4ta);
    }
    
    public double totalrentasde4y5ta (double totalrenta4,double ingreso5ta){
        return service.totalrentasde4y5ta(totalrenta4, ingreso5ta);
    }
    
    public double deduccionfinal (double totalrenta){
        return service.deduccionfinal(totalrenta);
    }
    
    public double totalrentaneta (double totalrenta){
        return service.totalrentaneta(totalrenta);
    }
    
    public double impuestorenta (double totalrentaneta){
        return service.impuestorenta(totalrentaneta);    
    }
}
