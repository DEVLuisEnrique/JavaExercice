package paqueteMain;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numeros[] = new int[100]; //arreglo que permite almacenar 100 numeros
		int aleatorio = (int)(Math.random()*100);
		int numMayor=0;
		
		for (int i = 1; i < numeros.length;i++) {//llenamos el arreglos con numeros random del 0-100
			
			numeros[i] = (int)(Math.random()*100);
			
		}
		
		for(int i = 1;i < numeros.length;i++) {//imprimir arreglo
			System.out.print(numeros[i]+", ");
		}
		
		
	
		
		
	}

}
