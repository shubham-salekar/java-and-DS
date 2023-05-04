import java.io.*;

class myreplaceDemo {

	static String myreplace(String str,char ch1,char ch2){
	
		int flag = 0;
		char arr[] = str.toCharArray();

		for(int i=0 ; i<arr.length ; i++){
		
			if(str.charAt(i) == ch1){
			
				arr[i] = ch2;
				flag = 1;
			}				
		}
		if(flag == 0){
			System.out.println("changable character not present");
			return str;
		}else{
		
			str = new String(arr);
			return str;
		}

		
	}
	public static void main(String ... args)throws Exception{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	

		System.out.println("Enter String");
		String str = br.readLine();

		System.out.println("Enter char");
		char ch1 = br.readLine().charAt(0);

		System.out.println("Enter char");
		char ch2 = br.readLine().charAt(0);

		System.out.println(myreplace(str,ch1,ch2));
	}
}
