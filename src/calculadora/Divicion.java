package calculadora;

public class Divicion extends Operacion{
    
    double div = 0;
       
    public Divicion(double n1, double n2) {
             
        super(n1, n2, '/');
   	 if(n2==0) System.out.println("No se puede dividir entre cero");
     else this.div = n1 / n2;
   	this.res = this.div; 
        
    }

    public void mostrarResultado() {
      	 System.out.println(this.n1+" "+this.operacion+" "+this.n2+" = "+this.res);
      }
}

