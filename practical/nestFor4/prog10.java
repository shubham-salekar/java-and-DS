
class Demo{

	public static void main(String[] args){
	
		int j=1;
		int row=4;
		int num = 1;

		for(int i=1 ; i<=row ; ){
		
			if(j<=i){
				
				if(num%2 == 0)			
					System.out.print(num*num*num +" "); 
				else
					System.out.print(num*num +" ");
				j++;
				num++;
			}else{
			
				j=1;i++;
				num = i;
				System.out.println();
			}
		}

	}
}
