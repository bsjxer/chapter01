package chapter01;

public class NumberTriangle {

	public static void main(String[] args) {
		if( args.length != 1) {
			System.out.println( "java NumberTrianle [N] : N은 숫자");
			return; // main은 void 이기 때문에 여기서 return은 종료를 의미
		}
		
		int count = Integer.parseInt( args[0] );
		// System.out.println( count );
		
		for( int i = 1; i <= count; i++ ) {
			// System.out.println( i );
			for( int j = 0; j < i ; j++ ) {
				System.out.print( i );
			}
			System.out.println();
		}
		
	}

}
