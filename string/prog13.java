import java.util.*;

class lastindexOfDemo {

	public static void main(String ... args){
	
		Scanner sc = new Scanner(System.in);

		String str1 = sc.nextLine();

		System.out.println(str1.lastIndexOf('s',0));
		System.out.println(str1.lastIndexOf('s',5));
		System.out.println(str1.lastIndexOf('h',5));
	}
}
