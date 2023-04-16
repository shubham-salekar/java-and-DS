
import java.io.*;

class IODemo{

	public static void main(String[] as)throws IOException{
	
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter name1");
		String name1 = br1.readLine();
		System.out.println("str1 = "+name1);
		

		System.out.println("Enter name2");
		
		//String name2 = br1.readLine();
		//char ch = name2.charAt(0);

		char ch = br1.readLine().charAt(0);
		System.out.println("ch = "+ch);

	}
}
