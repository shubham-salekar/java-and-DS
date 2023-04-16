/*
D4 C3 B2 A1 
A1 B2 C3 D4 
D4 C3 B2 A1 
A1 B2 C3 D4 
*/

import java.io.*;

class Demo{

	public static void main(String[] cas)throws Exception{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int row = Integer.parseInt(br.readLine());

		char ch = 'A';
		ch += row-1;
		int num = row;

		for(int i=1 ; i<=row ; i++){
		
			for(int j=1 ; j<=row ; j++){
			
				if(i%2 == 1){
			
					System.out.print(ch);	
					System.out.print(num+" ");
					num--;
					ch--;
				}else{
				
					System.out.print(ch);	
					System.out.print(num +" ");
					ch++;
					num++;
				}
			}
			System.out.println();
			if(i%2==0){
			
				ch = 'A';
				ch += row-1;
				num = row;
			}else{
			
				ch = 'A';
				num = 1;
			}
		}
	}
}
