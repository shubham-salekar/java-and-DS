
class Demo{

	public static void main(String ... argd) {
	
		String str1 = "shubham";
		String str2 = new String("shubham");

		char[] str3 = {'s','h','u','b','h','a','m'};
		String str4 = new String(str3);

		System.out.println(str1.equals(str2));
		System.out.println(str1.contentEquals(str2));
		
		System.out.println(str1.equalsIgnoreCase(str2));

		System.out.println(str1.compareTo(str2));
		System.out.println(str1.compareToIgnoreCase(str2));
	
		System.out.println(str2.substring(2,5));
		
		System.out.println(str2.matches(str4));
		
		System.out.println(str2.contains(str4));

		System.out.println(str2.replace('s','m'));
		
	//	System.out.println(str2.trim());
	//	System.out.println(str2.stripLeading());
	
	
	}
}
