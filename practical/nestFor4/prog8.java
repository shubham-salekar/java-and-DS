
class Demo{

	public static void main(String[] args){
	
		int j=1;
		int row=4;
		int num = row*(row+1)/2;
		char ch = 'A';
		ch+= num-1;

		for(int i=1 ; i<=row ; ){
		
			if(j<=i){
				
				if(i%2 == 1)
					System.out.print(num +" ");
				else
					System.out.print(ch+" ");
				j++;
				ch--;
				num--;
			}else{
			
				j=1;i++;
				System.out.println();
			}
		}

	}
}
