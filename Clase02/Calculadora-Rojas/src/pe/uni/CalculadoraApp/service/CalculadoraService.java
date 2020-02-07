/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.uni.CalculadoraApp.service;

/**
 *
 * @author YOVANN
 */
public class CalculadoraService {
    
    /**calcula la suma 
     resta
     multiplicaicon
     division
     **/
    
   public double CalcularSuma(double a,double b){
       
       double suma;
       suma=a+b;
       return suma;
   }
   public double CalcularResta(double a,double b){
       double resta;
       resta=a-b;
       return resta;
   }
   
   public double CalcularMultiplicacion(double a,double b){
       double multiplicacion;
       multiplicacion = a*b;
       return multiplicacion;
   }
   
   public double CalcularDivision(double a,double b){
       double division;
       division = a/b;
       return division;
   }
   
   
}
