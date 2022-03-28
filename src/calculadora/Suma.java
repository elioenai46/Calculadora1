package calculadora;

public class Suma extends Operacion{
    
    double suma;
       
    public Suma(double n1, double n2) {
             
        super(n1, n2, '+');
        this.suma = n1 + n2;
        this.res = this.suma; 
    }
    public void mostrarResultado() {
    	 System.out.println(this.n1+" "+this.operacion+" "+this.n2+" = "+this.res);
    }
}