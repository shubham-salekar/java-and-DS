// myconcat() 

class concatdemo{

	static void myconcat(String str1,String str2){
	
		str1 = str1 + "\0";
		str2 = str2 + "\0";

		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();

		char[] arr3 = new char[(str1.length()+str2.length())];

		int len = 0;
		while(arr1[len] != '\0'){
		
			arr3[len] = arr1[len];
			len++;
		}
		int len2 = 0;
		while(arr2[len2] != '\0'){
		
			arr3[len] = arr2[len2];
			len++;
			len2++;
		}

		System.out.println(len);
		String str3 = new String(arr3);
		
		System.out.println(arr3);
		
	}
	public static void main(String[] ar){
	
		String str1 = "Shubham";
		String str2 = "Salekar";

		myconcat(str1,str2);
	}
}
