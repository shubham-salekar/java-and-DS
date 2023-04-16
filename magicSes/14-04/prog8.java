/*
$ 
@ @ 
& & & 
# # # # 
$ $ $ $ $ 
@ @ @ @ @ @ 
& & & & & & & 
# # # # # # # #

*/

import java.io.*;

class Demo{

	static int flag = 1;

	public static void main(String[] cas)throws Exception{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int row = Integer.parseInt(br.readLine());

		for(int i=1 ; i<=row ; i++){
		
			for(int j=1 ; j<=i ; j++){
			
				if(flag == 1)
					System.out.print("$ ");
				if(flag == 2)
					System.out.print("@ ");
				if(flag == 3)
					System.out.print("& ");
				if(flag == 4)
					System.out.print("# ");
			}
			flag++;
			if(flag == 5)
				flag = 1;

			System.out.println();
		}
	}
}
