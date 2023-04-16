
// difference between characters if they are unequal.

import java.io.*;

class Demo{

        public static void main(String[] cas)throws Exception{

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		char ch1 = br.readLine().charAt(0);
		char ch2 = br.readLine().charAt(0);

		if(ch1 == ch2)
			System.out.println("equal charcters");
		else{
		
			if(ch1>ch2)
				System.out.println((int)(ch1-ch2));
			else
				System.out.println(ch2-ch1);		// without typecast chalt
		}	

	}
}
