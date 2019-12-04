package es.Studium.Triangulos;

import java.util.Scanner;

public class Triangulos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2, num3; //números Enteros
		//Creamos el objeto que nos permite leer por teclados
		java.util.Scanner teclado = new Scanner(System.in);
		//mostramos por pantalla y recojemos un numero por teclado
		System.out.println("Introduzca el primer número");
		num1 = teclado.nextInt();
		System.out.println("Introduzca el segundo número");
		num2 = teclado.nextInt();
		System.out.println("Introduzca el tercer número");
		num3 = teclado.nextInt();
		teclado.close();
		if((num1==0)||(num2==0)||(num3==0))
		{
			System.out.println("No se puede introducir el valor 0");
		}
		else
		{
			if((num1==num2)&&(num2==num3))
			{
				System.out.println("Es un triangulo equilátero");
			}
			else
			{
				if ((num1==num2) || (num2==num3) || (num1==num3))
				{
					System.out.println("Es un triangulo Isóseles");
				}
				else
				{
				System.out.println("Es un triangulo Escaleno");
				}
			}
		}
	}

}
