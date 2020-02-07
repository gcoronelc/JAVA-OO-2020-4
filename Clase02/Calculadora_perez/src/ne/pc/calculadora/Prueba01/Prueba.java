package ne.pc.calculadora.Prueba01;

import java.util.Scanner;
import ne.pc.calculadora.Service.Service;

public class Prueba {
    public static void main(String[] args) {
        double suma,resta,div,multi,dato1,dato2;
        Scanner scanner= new Scanner(System.in);
        System.out.println("dato1:");
        dato1=scanner.nextDouble();
        System.out.println("dato2:");
        dato2=scanner.nextDouble();
        Service operacion= new Service();
        suma=operacion.calcSuma(dato1, dato2);
        resta=operacion.calcResta(dato1, dato2);
        div=operacion.calcDiv(dato1, dato2);
        multi=operacion.calcMulti(dato1, dato2);
        System.out.println("suma:"+suma+"\nresta:"+resta+"\ndivision:"+div+"\nmultiplicacion:"+multi);
    }
    
}