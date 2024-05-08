package basic;

public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int i = Integer.MAX_VALUE;
//		long i2 = Long.MAX_VALUE;
//		
//
//		System.out.println(i);
//		System.out.println(i2);
//		
//		i = (int)i2;
//		System.out.println(i);

		byte b1 = 10;
		byte b2 = 20;
		//byte b3 = b1+b2; // 오류 발생
		byte b3 = (byte) (b1+b2);
		System.out.println(b3);
		
		int i1 = 10;
		long l1 = 20;
		//int i2 = i1 + l1; // 오류 발생 
		int i2 = i1 + (int)l1;
		System.out.println(i2);
		
		float f1 = (float) 10.0;
		float f3 = 10.0f; // 오른쪽은 double이 되기 때문에 f1, f3 둘중 하나와 같이 float을 붙여줘야 
		//float f2 = f1 + 20.0; // 오류 발생
		float f2 = (float) (f1 + 20.0);
		
		System.out.println(f2);
	
		

	}

}
