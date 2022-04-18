package paqueteMain;



public class Main {

	public static void main(String[] args) {
	
		int numeros[] =  new int[20];
	
		for (int i = 1; i < numeros.length;i++) {
			numeros[i] = 1+(int)(Math.random()*100);
			
		}
		
		for (int i = 1; i < numeros.length;i++) {
			System.out.print(numeros[i]+", ");
			
		}
		System.out.println();
		//Verifica si en el arreglo Existe cien?
		for(int i = 1;i< numeros.length;i++) 
			{
				if(numeros[i] == 100) 
					{
						System.out.println("Existe cien");
					}
			}
	

	}

}
