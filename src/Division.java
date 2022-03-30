/*

Autor: Maximiliano Pacheco Pérez
Fecha de Creacion: 25/03/2022
Fecha de Actualización: 28/03/2022
Descripción: En esta clase se realiza 
             la operación de División
*/
public class Division extends Operacion{
	double div = 0;
	
	public Division (double n1, double n2) {
		super(n1, n2,'/');
		if(n2==0) System.out.println("No se puede dividir entre cero");
		else this.div= n1 /n2;
		this.res =this.div;
	}
	
	public void mostrarResultado() {
		System.out.println(this.n1+""+this.operacion+""+this.n2+" = "+this.res);
	}
}
