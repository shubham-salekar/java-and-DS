import java.io.*;

class indexOfDemo {

	static int myindexOf(String str,char ch,int n){
	
		char arr[] = str.toCharArray();

		for(int i=n ; i<arr.length ; i++){
		
			if(arr[i] == ch){
			
				return i;
			}
		}
		return -1;
	}
	public static void main(String ... args)throws Exception{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	

		System.out.println("Enter String");
		String str = br.readLine();

		System.out.println("Enter char");
		char ch = br.readLine().charAt(0);

		System.out.println("Enter index");
		int n = Integer.parseInt(br.readLine());

		System.out.println(myindexOf(str,ch,n));
	}
}
