import java.io.*;

class lastindexOfDemo {

	static int mylastindexOf(String str,char ch,int n){
	
		char arr[] = str.toCharArray();

		for(int i=n ; i>=0 ; i--){
		
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

		System.out.println(mylastindexOf(str,ch,n));
	}
}
