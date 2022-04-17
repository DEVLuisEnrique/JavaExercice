package paqueteMain;

public class NumerosPares {
	
	public void numPares(int array[]) {
		
		System.out.println();
		for(int i = 0; i < array.length; i++) 
			{
				if(array[i] % 2 ==0) 
					{
						System.out.print(array[i]+", ");
					}
			}
		
	}

}
