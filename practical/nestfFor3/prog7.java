class Demo{

	public static void main(String [] args){

		int row = 6;;
		int j = 1;
		char ch = 'A';
		ch += row-1;

		for(int i=1 ; i<=row ; ){
		
			if(j<=i){
			
				System.out.print(ch++ +" ");
				j++;
			}else{
			
				j=1;
				ch -= i+1;
				i++;
				System.out.println();
			}
		}
	}
}
