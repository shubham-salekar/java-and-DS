/*
 series of prime number
1
100
1 2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97

*/

import java.io.*;

class Demo{

	public static void main(String[] cas)throws Exception{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int start = Integer.parseInt(br.readLine());
		int end = Integer.parseInt(br.readLine());

		for(int i=start ; i<=end ; i++){
		
			int num = i;
			int count = 0;

			for(int j=2 ; j*j <= num ; j++){
			
				if(num%j == 0){
				
					count++;
					break;
				}
			}
			if(count == 0)
				System.out.printf(num+" ");
		}
		System.out.println();
	}
}
