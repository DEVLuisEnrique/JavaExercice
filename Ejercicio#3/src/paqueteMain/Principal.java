package paqueteMain;

import java.util.Iterator;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);//instaciamos objeto que permita la entrada de datos
	
		int numero;
		int resultado;
		
		try {
			
		
		
		System.out.print("La tabla del?\nIngrese un numero: ");
		numero = entrada.nextInt();
		
		System.out.println();
		System.out.println("Esta es la tabla del "+numero);
	
		for(int i = 0; i <= 12;i++) 
			{
				resultado = numero * i;
				System.out.println(numero+"x"+i+" = "+resultado);
			}
		} catch (Exception e) {
			System.out.println("Solo puede ingresar numero");
		}
		
				
	
	}

}
