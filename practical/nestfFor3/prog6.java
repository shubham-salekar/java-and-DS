class Demo{

	public static void main(String [] args){

		int row = 4;;
		int j = 1;
		int num = 9;
		for(int i=1 ; i<=row ; ){
		
			if(j<=i){
			
				System.out.print(num-- +" ");
				j++;
			}else{
			
				j=1;
				i++;
				num = 9;
				System.out.println();
			}
		}
	}
}
