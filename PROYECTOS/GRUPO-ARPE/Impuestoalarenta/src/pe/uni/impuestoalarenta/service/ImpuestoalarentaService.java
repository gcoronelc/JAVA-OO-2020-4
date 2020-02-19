package pe.uni.impuestoalarenta.service;

public class ImpuestoalarentaService {
    
    public final int uit=4200;
    
    public double deduccion4ta (double ingreso4ta){
        double deduccion=ingreso4ta*0.2;
        if(deduccion>24*uit)
            deduccion=24*uit;
        return deduccion;
    }
    
    public double rentaneta4ta (double ingreso4ta){
        return ingreso4ta-deduccion4ta(ingreso4ta);
    }
    
    public double totalrenta4 (double ingreso4ta,double otingreso4ta){
        return rentaneta4ta(ingreso4ta)+otingreso4ta;
    }
    
    public double totalrentasde4y5ta (double totalrenta4,double ingreso5ta){
        return totalrenta4+ingreso5ta;
    }
    
    public double deduccionfinal (double totalrenta){
        double deduccion=totalrenta;
        if(totalrenta>7*uit)
            deduccion=7*uit;
        return deduccion;
    } 
    public double totalrentaneta (double totalrenta){
        return totalrenta-deduccionfinal(totalrenta);
    }
    public double impuestorenta (double totalrentaneta){
        double impuesto;
        if(totalrentaneta<=0)
            impuesto=0;
        else if(totalrentaneta<5*uit)
            impuesto=totalrentaneta*0.08;
        else if(totalrentaneta<20*uit)
            impuesto=(totalrentaneta-5*uit)*0.14+5*uit*0.08;
        else if(totalrentaneta<35*uit)
            impuesto=(totalrentaneta-20*uit)*0.17+15*uit*0.14
                    +5*uit*0.08;
        else if(totalrentaneta<45*uit)
            impuesto=(totalrentaneta-35*uit)*0.2+15*uit*0.17
                    +15*uit*0.14+5*uit*0.08;
        else
            impuesto=(totalrentaneta-45*uit)*0.3+10*uit*0.2
                    +15*uit*0.17+15*uit*0.14+5*uit*0.08;
        return impuesto;    
    }
}
