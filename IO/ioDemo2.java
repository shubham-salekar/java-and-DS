
import java.io.*;

class IODemo{

	public static void main(String[] as)throws IOException{
	
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.println("Enter name1");
		String name1 = br.readLine();
		System.out.println("str1 = "+name1);
		
		isr.close();
		
		System.out.println("Enter char");

	//	br.Reset();
		int name2 = br.read();
		isr.skip(1);

		System.out.println("char = "+name2);
		System.out.println("char = "+name2);
		System.out.println("char = "+name2);

	}
}
