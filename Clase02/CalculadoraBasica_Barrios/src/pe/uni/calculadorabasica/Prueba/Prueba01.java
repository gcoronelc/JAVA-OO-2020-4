/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.uni.calculadorabasica.Prueba;

import java.util.Scanner;
import pe.uni.calculadorabasica.Service.CalculadoraBasicaService;

/**
 *
 * @author Fernando Barrios
 */
public class Prueba01 {
    public static void main(String[] args) {
        //variables
        double Suma, Resta, Mult, Div, valor1, valor2;
        Scanner scanner = new Scanner(System.in);
        //datos
        System.out.print("Valor 1: ");
         valor1= scanner.nextDouble();
        System.out.print("valor 2: ");
         valor2= scanner.nextDouble();
        //procesos
        CalculadoraBasicaService service = new CalculadoraBasicaService();
        Suma = service.calcSuma(valor1, valor2);
        Resta = service.calcResta(valor1, valor2);
        Mult = service.calcMult(valor1, valor2);
        Div = service.calcDiv(valor1, valor2);
        //reporte
        System.out.println("El resultado de la suma es: " + Suma);
        System.out.println("El resultado de la resta es: " + Resta);
        System.out.println("El resultado de la multiplicación es: " + Mult);
        System.out.println("El resultado de la división es: " + Div);
    }
}
