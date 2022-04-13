package paqueteMain;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int  num1,num2,num3;
	
	num1 =9;
	num2 =4;
	num3 =4;
	
	if((num1 < num2) && (num1 < num3)) //num1 es menor
		{
			
			if(num2 < num3) //num2 es menor
				{
					
					System.out.println(num1+","+num2+","+num3);
				}
			else //num3 es mayor que num2
				{
					System.out.println(num1+","+num3+","+num2);
				}
		}
	else if((num2 < num1)&&(num2 < num3)) //num2 es menor
			{
			if(num1 < num3) //num1 es menor
				{
					
					System.out.println(num2+","+num1+","+num3);
				}
			else //num3 es menor que num1
				{
					System.out.println(num2+","+num3+","+num1);
				}
		
		}
	
	else if((num3 < num1)&&(num3 < num2)) //num3 es menor
		{
			if(num2 < num1) //num2 es menor
				{
					
					System.out.println(num3+","+num2+","+num1);
				}
			else //num2 es menor que num1
				{
					System.out.println(num3+","+num1+","+num2);
				}

		}	
		
	
	}

}
