
package pe.uni.calculadorabasica.Service;


public class CalculadoraBasicaService {
    
    public double calcSuma (double valor1, double valor2) {
        //variables
        double Suma;
        //proceso
        Suma = valor1 + valor2;
        //reporte
        return Suma;
    }
     public double calcResta (double valor1, double valor2) {
        //variables
        double Resta;
        //proceso
        Resta = valor1 - valor2;
        //reporte
        return Resta;
    }
     public double calcMult (double valor1, double valor2) {
        //variables
        double Mult;
        //proceso
        Mult = valor1 * valor2;
        //reporte
        return Mult;
    }
     public double calcDiv (double valor1, double valor2) {
        //variables
        double Div;
        //proceso
        Div = valor1 / valor2;
        //reporte
        return Div;
    }
}
