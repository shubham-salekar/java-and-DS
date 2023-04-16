
class Demo{

	public static void main(String[] args){
	
		int row=4;
		int j = row;
		char ch = 'A';

		for(int i=1 ; i<=row ; ){
		
			if(j>=i){
				
				System.out.print(ch++ +" ");
				j--;
			}else{
			
				j=row;
				ch -= row-i;
				i++;
				System.out.println();
			}
		}

	}
}
