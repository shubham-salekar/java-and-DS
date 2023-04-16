class Demo{

	public static void main(String [] args){

		int row = 4;;
		int j = row;
			
		for(int i=1 ; i<=row ; ){
		
			if(j>=i){
			
				System.out.print("3C ");
				j--;
			}else{
			
				j=row;
				i++;
				System.out.println();
			}
		}
	}
}
