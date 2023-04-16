/*
# = = = = 
= # = = = 
= = # = = 
= = = # = 
= = = = # 
*/

import java.io.*;

class Demo{

	public static void main(String[] cas)throws Exception{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int row = Integer.parseInt(br.readLine());

		for(int i=1 ; i<=row ; i++){
		
			for(int j=1 ; j<=row ; j++){
			
				if(i == j){
			
					System.out.print("# ");	
				}else{
				
					System.out.print("= ");
				}
			}
			System.out.println();
		}
	}
}
