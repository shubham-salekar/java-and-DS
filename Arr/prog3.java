
import java.lang.annotation.Native;

class Demo{

 	static void valueOf(int i) {
        
		/*if (i >= IntegerCache.low && i <= IntegerCache.high)
        	    	return IntegerCache.cache[i + (-IntegerCache.low)];
        	
		return new Integer(i);
		*/
		System.out.println(Integer.IntegerCache.low);

    	}
	public static void main(String[] aee){
	
		valueOf(10);	
	}
}
