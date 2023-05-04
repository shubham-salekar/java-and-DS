import java.io.*;

class mysubstringDemo {

	static String mySubstring(String str,int n1,int n2){
	
		char arr[] = str.toCharArray();

		char arr2[] = new char[arr.length];

		for(int i=n1 ; i<n2 ; i++){
		
			arr2[i] = arr[i];
		}
		String str2 = new String(arr2);
		return str2;

	}
	public static void main(String ... args)throws Exception{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	

		System.out.println("Enter String");
		String str = br.readLine();

		System.out.println("Enter start index");
		int n1 = Integer.parseInt(br.readLine());

		System.out.println("Enter end index");
		int n2 = Integer.parseInt(br.readLine());

		System.out.println(mySubstring(str,n1,n2));
	}
}
