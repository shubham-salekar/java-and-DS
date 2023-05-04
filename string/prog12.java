import java.util.*;

class indexOfDemo {

	public static void main(String ... args){
	
		Scanner sc = new Scanner(System.in);

		String str1 = sc.nextLine();

		System.out.println(str1.indexOf('s',0));
		System.out.println(str1.indexOf('s',1));
		System.out.println(str1.indexOf('s',2));
	}
}
