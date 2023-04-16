
import java.io.*;

class IODemo{

	public static void main(String[] as)throws IOException{
	
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter name1");
		String name1 = br1.readLine();
		System.out.println("str1 = "+name1);
		
		br2.close();

		System.out.println("Enter name2");
		String name2 = br1.readLine();
		System.out.println("str2 = "+name2);

	}
}
