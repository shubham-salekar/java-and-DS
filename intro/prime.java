
class prime{

	public static void main(String[] s){
	
		int num = 50;

		int count = 2;

		for(int i=2 ; i<= (num/2) ; i++){
		
			if(num % i == 0){
			
				count++;
				break;
			}
		}
		System.out.println("count = "+count);
		
		if(count == 2)
			System.out.println(num+" is prime number");
		else
			System.out.println(num+" is not prime number");
	}
}
