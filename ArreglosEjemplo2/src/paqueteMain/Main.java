package paqueteMain;



public class Main {

	public static void main(String[] args) {
	
		int numeros[] =  new int[20];
		int sumaFirstLast =0;
		for (int i = 0; i < numeros.length;i++) {
			numeros[i] = (int)(Math.random()*100);
			
		}
		int firstNum =  numeros[0];
		int lastNum = numeros[numeros.length-1];
		sumaFirstLast = firstNum+lastNum;
		System.out.println();
		for (int i = 0; i < numeros.length;i++) {
			System.out.print(numeros[i]+", ");
			
			
		}
		System.out.println();
		System.out.println("primer numero: "+firstNum);
		System.out.println("ultimo numero: "+lastNum);
		System.out.println("Suma: "+sumaFirstLast);

	}

}
