package chapter01;

public class VariableTest {
	public static void main(String[] args){
		byte b =20;
		short s =100;
		int i=10;
		long l =90;
		float f=3.14f;
		double d = 3.14;
		char c = 'A';
		boolean bool = true;
		
		String str = "Hello World";
		
		System.out.println(b);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(bool);
		System.out.println(c);
		
		System.out.println(str);
		
		// reference type ( 참조형 )
		Circle circle = new Circle();
//		System.out.println(circle.area);
//		System.out.println(circle.radius);  초기화 값은 0
		
		circle.radius = 5;
		circle.area = 5 * 5 * 3.14 ;
		
		System.out.println(circle.area);
		
		
		String str1 = new String( "Hello World");
		System.out.println(str1);
		
		String str2 = "Hello World";
		System.out.println(str2);
		
		//character 형
		char ch1 = '1';
		char ch2 = 49;
		char ch3 = 1;
		
		System.out.println( ch1 + ":" + ch2 + ":" + ch3 );
		
		
		

		
		
	}
}
