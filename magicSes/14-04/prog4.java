/*

find all even numbers in reverse order and odd number in standard order in range

*/

import java.io.*;

class Demo{

	public static void main(String[] cas)throws Exception{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter start and end");

		int start = Integer.parseInt(br.readLine());
		int end = Integer.parseInt(br.readLine());

		for(int i=end ; i>=start ; i--){
		
			if(i%2==0)
				System.out.print(i +" ");
		}
		System.out.println();

		for(int j=start ; j<=end ; j++){
			
			if(j%2 == 1)
				System.out.print(j+" ");
				
		}
		System.out.println();
	}
}
