/*Autor: Carlos Aurelio Alcantara Perez
Fecha de creacion:25-03-2022
Fecha de actualizacion: 28-03-2022
Descripcion:Multiplicacion de dos numeros 
**********************************************/


package calculadora;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		System. out. print( "pon un numero  "  );
		double n1 = sc.nextInt();
    	System. out. print( "pon el segundo numero  "  );
    	double n2 = sc.nextInt();
		//double n1 = 10;
		//double n2 = 5;
		        
		//suma
		Suma sum = new Suma(n1,n2);
		sum.mostrarResultado();
		        
		//resta
		Resta res = new Resta(n1,n2);
		res.mostrarResultado();
		        
		//multiplicacion
		Multiplicacion mul = new Multiplicacion(n1,n2);
		mul.mostrarResultado();
		        
		//division
		Divicion div = new Divicion(n1,n2);
		div.mostrarResultado();

	}

}
