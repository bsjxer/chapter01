package chapter01;

public class ConsantTest {

	public static void main(String[] args){
		final int CONST_NUMBER = 10;
		final double PI = 3.1418;

		int number = 10;
		System.out.println(number);
		
		number= 20;
		System.out.println(number);
		
		//상수는 다시 값 대입이 안됨
		//CONST_NUMBER = 20;
		System.out.println(CONST_NUMBER);
		
		
//		double a1 = PI * r1 * r1;
//		double a2 = PI * r2 * r2;	
//		double a3 = PI * r3 * r3;
		
	}
}
