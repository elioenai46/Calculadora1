
/*Autor: Carlos Aurelio Alcantara Perez
Fecha de creacion:25-03-2022
Fecha de actualizacion: 28-03-2022
Descripcion:clase para capturar los numeros e imprimir las operaciones 
**********************************************/
package calculadora;

public class Operacion {
    
    double n1;
    double n2;
    double res;
    char operacion;

    
    public Operacion(double n1, double n2, char operacion) {
        
        this.n1 = n1;
        this.n2 = n2;
        this.operacion = operacion;
    }
    
        
    public void mostrarResultado(){
        
        System.out.println(this.n1+" "+this.operacion+" "+this.n2+" = "+this.res);
        
    }
}
