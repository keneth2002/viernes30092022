package viernes30092002;

import java.util.Scanner;

public class Metodos {

	public static void main(String[] args) {
		
		
		calcularRaicesCuadraticas(); // LLamada del metodo
     
	}//cierre del main
	
	//modificador de accesos + 
	//tipo de datos que va a devolver el el metodo + 
	//nombre del metodo + los parentesis() +
	//y/o lista de parametros de entrada
	
	private static void calcularRaicesCuadraticas() {
		 Scanner lector = new Scanner(System.in);
		//cuerpo del metodo
		   System.out.println("a = ");
	       double a = lector.nextDouble();
	       System.out.println("b = ");
	       double b = lector.nextDouble();
	       System.out.println("c = ");
	       double c = lector.nextDouble();
	       
	       double discriminante = Math.pow(b, 2) - 4 * a * c;
	       
	       double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
	       double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
	       
	       System.out.println("x1 = " + x1);
	       System.out.println("x2 = " + x2);
		
		
		
	}
	
	
	
	
	
	

}//cierre de la clase
