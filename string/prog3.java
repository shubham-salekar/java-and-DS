// my compareTo() 

class compareToDemo{

	static int mylength(String str){
	
		char arr[]= str.toCharArray();
		int cnt = 0;
		for(int i = 0 ; i<arr.length ; i++){
		
			cnt++;
		}
		return cnt;

	}
	static int mycompareto(String str1,String str2){
	
		if(mylength(str1) != mylength(str2)){
		
			return mylength(str1) - mylength(str2);
		
		}else{

			str1 = str1 + "\0";

			char[] arr1 = str1.toCharArray();
			char[] arr2 = str2.toCharArray();

			int len = 0;
			while(arr1[len] != '\0'){
		
				if(arr1[len] != arr2[len]){
					return arr1[len] - arr2[len];
				}
				
				len++;	
			}
		}
		return 0;
		
	}
	
	public static void main(String[] ar){
	
		String str1 = "core2web";
		String str2 = "core2webTech";

		int n = mycompareto(str1,str2);
		System.out.println(n);
	}
}
