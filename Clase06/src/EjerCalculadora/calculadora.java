package EjerCalculadora;

public class calculadora {
	
	double num1,num2;
	
	public double sumar(double unNumero,double otrNumero)
	{
		return unNumero+otrNumero;
	}
	public double restar(double unNumero,double otrNumero)
	{
		return unNumero-otrNumero;
	}
	public double multiplicar(double unNumero,double otrNumero)
	{
		return unNumero*otrNumero;
	}
	public double dividir(double unNumero,double otrNumero)
	{
		if(otrNumero==0)
		{
		    System.out.println("No es posible dividir por 0");
			return 0;
		}
		else
		{
			return unNumero/otrNumero;
		}
		
	}

}
