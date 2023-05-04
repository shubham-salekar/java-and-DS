// mycharAt() 

class charAtDemo{

	static void mycharAt(String str,int index){
	
		char[] arr = str.toCharArray();

		int len = 0;
		for(char ch : arr){
			
			len++;
			if(arr[len] == arr[index]){
			
				break;
			}
			
		}
		System.out.println("char at "+index+" = "+arr[len]);
		
	}
	public static void main(String[] ar){
	
		String str = "Shubham";
		int index = 5;
		mycharAt(str,index);
	}
}
