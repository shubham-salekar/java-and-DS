
class Demo{

	public static void main(String[] args){
	
		int row=4;
		int j = row;
		int num = 1;

		for(int i=1 ; i<=row ; ){
		
			if(j>=i){
				
				System.out.print(num++ +" ");
				j--;
			}else{
			
				j=row;
				i++;
				num = i;
				System.out.println();
			}
		}

	}
}
