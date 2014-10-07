public class Rectangulo{

private double base;
private double altura;
private double perimetro;
private double superficie;

//comienza el constructor //

public Rectangulo (double valorAltura,double valorBase);
{
this.valorAltura = altura;
this.valorBase = base;
}

public void setBase (double base)
{
this.valorBase = base;
}
public void setAltura (double altura)
{
this.valorAltura = altura;
}


public double getBase();
{
return valorBase;
}

public double getAltura();
{
return valorAltura;
}

public double Superficie ()
{
superficie = valorBase * valorAltura;
return superficie;
}

public double Perimetro ()
{
perimetro = (2*base) + (2*altura);
return perimetro; 
	}
}



