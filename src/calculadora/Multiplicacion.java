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