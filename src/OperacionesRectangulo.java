import java.util.Scanner; 

public class OperacionesRectangulo {

public static void main (String args[]){


double altura = 0;
double base = 0;
double superficie;

	Rectangulo operaciones = new Rectangulo(altura, base);
 
	superficie = operaciones.Superficie();


	Scanner sc = new Scanner(System.in);
	System.out.print("\ningresa la altura del rectangulo : ");
	altura = sc.nextDouble();

	System.out.print("\ningresa la base del rectangulo : ");
        base = sc.nextDouble();
	
	Rectangulo operaciones = new Rectangulo(altura, base);
        
        System.out.print("\nla base es: " + operaciones.Superficie());
	System.out.print("\nel perimetro es: " + operaciones.Perimetro());
	
	}
}

		
