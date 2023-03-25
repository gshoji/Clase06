package EjerCalculadora;

import java.util.Scanner;

public class Main {

	public static void main(String[] args)
	{
		calculadora calc =new calculadora();
		Scanner leer=new Scanner(System.in);
		
		System.out.println("Ingrese el primer numero: ");
		int nu1=leer.nextInt();
		System.out.println("Ingrese el segundo numero: ");
		int nu2=leer.nextInt();
		
		System.out.println("La suma es: "+calc.sumar(nu1, nu2));
		System.out.println("La resta es: "+calc.restar(nu1, nu2));
		System.out.println("La multiplicacion es: "+calc.multiplicar(nu1, nu2));
		System.out.println("la divicion es: "+calc.dividir(nu1, nu2));
		System.out.println("Gracias!");

	}

}
