
class Demo{

	public static void main(String[] args){
	
		int j=1;
		int row=6;
		char ch = 'A';
		ch += row-1;
		int num = 1;

		for(int i=1 ; i<=row ; ){
		
			if(j<=i){
				
				if(j%2 == 1){
					System.out.print(ch++ +" ");
				}else{
				
					System.out.print(num++ +" ");
				}
				j++;
			}else{
			
				j=1;i++;
				ch = 'A';
				ch += row-i;
				System.out.println();
			}
		}

	}
}
