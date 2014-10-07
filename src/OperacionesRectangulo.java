import java.util.Scanner; 

public class OperacionesRectangulo {

public static void main (String args[]){

double altura;
double base;
double superficie;
// inicio del constructor
	Rectangulo operaciones = new Rectangulo(base, altura);
 
	superficie = operaciones.Superficie();


	Scanner sc = new Scanner(System.in);
	System.out.print("\ningresa la altura del rectangulo : ");
	altura = sc.nextDouble();

	System.out.print("\ningresa la base del rectangulo : ");
        base = sc.nextDouble();

	operaciones.setBase(base);
	operaciones.setAltura(altura);

	System.out.print("\nla base es: " + operaciones.Superficie());
	System.out.print("\nel perimetro es: " +operaciones.Perimetro());
	
	}
}

		
