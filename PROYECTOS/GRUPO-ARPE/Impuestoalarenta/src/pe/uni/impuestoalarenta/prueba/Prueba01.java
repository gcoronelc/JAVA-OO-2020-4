
package pe.uni.impuestoalarenta.prueba;

import java.util.Scanner;
import pe.uni.impuestoalarenta.service.ImpuestoalarentaService;

public class Prueba01 {
    public static void main(String[] args) {
        ImpuestoalarentaService service=new ImpuestoalarentaService();
        Scanner scanner=new Scanner(System.in);
        double rent4ta,rent5ta,otrent4ta;
        
        System.out.println("Renta 4ta categoria:");
        rent4ta=scanner.nextDouble();
        System.out.println("Otras Rentas 4ta categoria:");
        otrent4ta=scanner.nextDouble();
        System.out.println("Renta 5ta categoria:");
        rent5ta=scanner.nextDouble();
        
        double deduc4ta,deducfinal,total4ta,rentNeta4ta,totalrenta
                ,totalRentaNeta,impuestoRenta;
        
        deduc4ta=service.deduccion4ta(rent4ta);
        rentNeta4ta=service.rentaneta4ta(rent4ta);
        total4ta=service.totalrenta4(rent4ta, otrent4ta);
        totalrenta=service.totalrentasde4y5ta(total4ta, rent5ta);
        deducfinal=service.deduccionfinal(totalrenta);
        totalRentaNeta=service.totalrentaneta(totalrenta);
        impuestoRenta=service.impuestorenta(totalRentaNeta);

        System.out.println("\n\nRenta 4ta: "+rent4ta);
        System.out.println("Deducción: "+deduc4ta);
        System.out.println("Renta neta 4ta: "+rentNeta4ta);
        System.out.println("Otras Rentas 4ta: "+otrent4ta);
        System.out.println("Total renta 4ta: "+total4ta);
        System.out.println("Renta 5ta: "+rent5ta);
        System.out.println("Total renta 4ta y 5ta: "+totalrenta);
        System.out.println("Deducción 7UIT: "+deducfinal);
        System.out.println("Total de renta neta: "+totalRentaNeta);
        System.out.println("Impuesto a la renta: "+impuestoRenta);
        
        
        
    }
    
}
