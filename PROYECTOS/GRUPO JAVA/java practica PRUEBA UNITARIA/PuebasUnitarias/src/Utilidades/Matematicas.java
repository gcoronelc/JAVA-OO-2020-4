
package Utilidades;

public class Matematicas {
    public static double mayor(double n1, double n2){
        double m=n1;
        if(n2>m){
            m=n2;
        }
        return m;
    }
    public static boolean esNumeroPrimo(int n){
        int i,a=0;
        for(i=1;i<(n+1);i++){
            if(n%i==0){
            a++;
        }
        }
        return (a==2);
    }
    
}
