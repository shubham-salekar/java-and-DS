
class Demo{

	public static void main(String[] ras){
	
		int row = 4;
		int j = row - 1;
		int k = 1;

		for(int i=1 ; i<= row ; ){
		
			if(j>=1){
			
				System.out.print("  ");
				j--;
			}
			else if(j == 0 && k<= (i*2-1)){
			
				System.out.print("* ");
				k++;
			}
			else{
			
				i++;
				j = row - i;
				k = 1;
				System.out.println();
			}

		}

	}
}
