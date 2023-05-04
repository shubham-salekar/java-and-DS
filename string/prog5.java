// myequals() 

class equalsDemo{

	static boolean myequals(String str1,String str2){
	
		if(str1.length() != str2.length())
			return false;

		else{
			str1 = str1 + "\0";
			str2 = str2 + '\0';

			char[] arr1 = str1.toCharArray();
			char[] arr2 = str2.toCharArray();

			int len = 0;
			while(arr1[len] != '\0'){
		
				if(arr1[len] != arr2[len])
					return false;
				len++;
			}
		}
		return true;
		 
		
	}
	public static void main(String[] ar){
	
		String str1 = "Shubham";
		String str2 = "sShubham";

		boolean n = myequals(str1,str2);
		System.out.println(n);
	}
}
