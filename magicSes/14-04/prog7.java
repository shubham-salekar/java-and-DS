/*
O 
14 13 
L K J 
9 8 7 6 
E D C B A 
*/

import java.io.*;

class Demo{

	public static void main(String[] cas)throws Exception{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int row = Integer.parseInt(br.readLine());
		
		//int row = 4;

		int var1 = row*(row+1)/2;

		char ch = 'A';
		int num = var1; 
		
		ch += var1-1;

		if(var1%2==1){

			for(int i=1 ; i<=row ; i++){
		
				for(int j=1 ; j<=i ; j++){
				
					if(i%2==1)
						System.out.print(ch+" ");
					else
						System.out.print(num+" ");

					ch--;
					num--;		
				}
				System.out.println();
			}
		}else{
			for(int i=1 ; i<=row ; i++){
		
				for(int j=1 ; j<=i ; j++){
				
					if(i%2==1)
						System.out.print(num+" ");
					else
						System.out.print(ch+" ");

					ch--;
					num--;		
				}
				System.out.println();
			}
		}
	}
}
