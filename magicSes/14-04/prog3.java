/*
5 4 3 2 1 
8 6 4 2 
9 6 3 
8 4 
5 

*/

import java.io.*;

class Demo{

	public static void main(String[] cas)throws Exception{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int row = Integer.parseInt(br.readLine());
		
		int num1 = row;
		int num2;

		for(int i=1 ; i<=row ; i++){
		
			num2 = num1*i;
			for(int j=row ; j>=i ; j--){
			
				System.out.print(num2 + " ");
				num2 = num2-i;
			}
			num1--;
			System.out.println();
		}
	}
}
