package assertApi;

public class ApplyStringClass {
	public static void main (String args[]) {
		String str  = new String("Welcome to JavaWorld for learnign Java");
		String SubStr1 = new String("JavaWorld is really cool to learn");
		String SubStr2 = new String("CoreJava is fun to learn") ;
		String str1 = new String("String equals method compares this string to the specified object");
		String str2 = new String("The result is true if and only if the argument is not null");
		String str3 = new String("String equals method compares this string to the specified object");
	System.out.println("Found Last Index : ");
	System.out.println(str.lastIndexOf('o'));
	System.out.println("Found Last Index : ");
	System.out.println(str.lastIndexOf('o',5));
	System.out.println("Found Last Index : ");
	System.out.println(str.lastIndexOf(SubStr1));
	System.out.println("Found Last Index : ");
	
	System.out.println(str.lastIndexOf(SubStr1 , 10));
	System.out.println("Found Last Index : ");
	System.out.println(str.lastIndexOf(SubStr2));
	System.out.println("Found Last Index : ");
	 boolean retVal =str1.equals(str2);
	 System.out.println("Return value = " + retVal);
	 retVal = str1.equals(str3);
	 System.out.println("Returned Value = "+ retVal);
	 System.out.println("String Length is "+ str1.length());
	 System.out.println("String Length si "+ str2.length());
	 System.out.println(str2.replace('r','R'));
	 System.out.println(str3.replaceFirst("String", "Sticks"));
	}
	
}
