
/*Autor: Carlos Aurelio Alcantara Perez
Fecha de creacion:25-03-2022
Fecha de actualizacion: 28-03-2022
Descripcion:Multiplicacion de dos numeros 
**********************************************/
package calculadora;

public class Multiplicacion extends Operacion{
    
    double multi;
       
    public Multiplicacion(double n1, double n2) {
             
        super(n1, n2, '*');
        this.multi = n1 * n2;
        this.res = this.multi; 
    }

    public void mostrarResultado() {
   	 System.out.println(this.n1+" "+this.operacion+" "+this.n2+" = "+this.res);
   }
}
