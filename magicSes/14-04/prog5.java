/*
0 
1 1 
2 3 5 
8 13 21 34

*/

import java.io.*;

class Demo{

	public static void main(String[] cas)throws Exception{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int row = Integer.parseInt(br.readLine());
		
		int num1 = 0;
		int num2 = 1;
		int num3;

		for(int i=1 ; i<=row ; i++){
		
			for(int j=1 ; j<=i ; j++){
			
				System.out.print(num1 + " ");
				num3 = num1+num2;
				num1 = num2;
				num2 = num3;
			}
			System.out.println();
		}
	}
}
