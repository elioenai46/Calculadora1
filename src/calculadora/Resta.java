/********************************************************
Autor: Salvador Elioenai Antonio Pérez
Fecha Actualización: 30 de marzo del 2022
Descripción: Clase para relaizar la resta de dos numeros
********************************************************/
package calculadora;

public class Resta extends Operacion{
    
    double resta;
       
    public Resta(double n1, double n2) {
             
        super(n1, n2, '-');
        this.resta = n1 - n2;
        this.res = this.resta; 
    }
    public void mostrarResultado() {
   	 System.out.println(this.n1+" "+this.operacion+" "+this.n2+" = "+this.res);
   }
}
