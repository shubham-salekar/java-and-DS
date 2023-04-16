
class ArmNum{

	public static void main(String[] args){
	
		int num1 = 54748;
		int count = 0;
		int num2 = num1;

		while(num2 != 0){
		
			count++;
			num2 = num2/10;
		}
		int sum = 0;
		int mul;
		int num3 = num1;

		int rem;
		while(num3 != 0){
		
			mul = 1;
			rem = num3 % 10;

			for(int i=1 ; i<=count ; i++)
				mul = mul*rem;

			sum = sum +mul;
			num3 = num3/10;
		}
		if(sum == num1 )
			System.out.println(num1+" Armstrong number");
		else
			System.out.println(num1+" Not Armstrong number");

	}
}
