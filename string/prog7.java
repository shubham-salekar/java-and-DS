
class Demo{

	public static void main(String ... argd) {
	
		String str1 = "shubham";
		String str2 = new String("shubham");

		String str3 = "shubham";
		String str4  = new String("shubham");

		char[] str5 = {'s','h','u','b','h','a','m'};
		String str6 = new String(str5);

		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));
		
		System.out.println(System.identityHashCode(str5));
		System.out.println(System.identityHashCode(str6));
	}
}
