/*
	addition of factorial of digit in number
	1234
	add of fact of digits is 33

*/

import java.io.*;

class Demo{

	public static void main(String[] cas)throws Exception{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = Integer.parseInt(br.readLine());
	
		int fact = 1;
		int add = 0;

		while(num!=0){
		
			int rem = num%10;
			fact = 1;

			for(int j=2 ; j<=rem ; j++){
			
				fact = fact*j;
			}
			add = add + fact;
			num = num/10;
		}
		System.out.printf("add of fact of digits is "+add+"\n");
	}
}
