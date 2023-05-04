// mylength() 

class LenDemo{

	static void mystrlen(String str){
	
		str = str + "\0";
		char[] arr = str.toCharArray();

		int len = 0;
		while(arr[len] != '\0'){
		
			len++;
		}
		System.out.println("len of "+str+" = "+len);
		
	}
	public static void main(String[] ar){
	
		String str = "Shubham";
		mystrlen(str);
	}
}
