package paqueteMain;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numeros[] = new int[100]; //arreglo que permite almacenar 100 numeros
		
		int numMayor,numMenor;
		
		
		
		for (int i = 0; i < numeros.length;i++) {//llenamos el arreglos con numeros random del 0-100
			
			numeros[i] = 1 + (int)(Math.random()*100);
			
		}
		
		for(int i = 0;i < numeros.length;i++) {//imprimir arreglo
			System.out.print(numeros[i]+", ");
		}
		System.out.println();
		
		//obtener el numero mayor del arreglo
		numMayor = numMenor =numeros[0];
		for(int n = 0; n < numeros.length;n++) 
			{
				if(numeros[n] > numMayor) 
					{
						numMayor = numeros[n];
					}
				if(numeros[n] < numMenor)
					{
						numMenor = numeros[n];
					}
			}
		System.out.println("El numero mayor es: "+numMayor);
		System.out.println("El numero menor es: "+numMenor);
		
		
	}

}
