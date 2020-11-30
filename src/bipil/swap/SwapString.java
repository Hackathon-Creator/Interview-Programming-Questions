package bipil.swap;

public class SwapString {
	
	public static void main(String[] args) {
		
		String a="Hello thiis is bipil";
		String b="World this is my land";
		
		b=a+b; // WorldHello
		a=b.substring(a.length(), b.length());
		b=b.substring(0, b.length()-a.length());
		
		System.out.println(a);
		System.out.println(b);
		
	}

}

