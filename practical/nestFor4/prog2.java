
class Demo{

	public static void main(String[] args){
	
		int j=1;
		int row=4;
		int num = 1;

		for(int i=1 ; i<=row ; ){
		
			if(j<=i){
				
				System.out.print(num++ +" ");
				j++;
			}else{
			
				j=1;i++;
				num++;
				System.out.println();
			}
		}

	}
}
