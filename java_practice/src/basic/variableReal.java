package basic;

import java.math.BigDecimal;

public class variableReal {

	public static void main(String[] args) {
		// 실수 
		float f1 = 2.0f;
		float f2 = 1.1f;
		float f3 = f1-f2;
		System.out.println(f3);
		// 결과 : 0.9
		
		double d1 = 2.0;
		double d2 = 1.1;
		double d3 = d1-d2;
		System.out.println(d3);
		// 결과 : 0.89999
		
	
		// 실수에서 정확한 연산을 하려면?
		System.out.println(((int)(d1*100)-(int)(d2*100))/100.0);
		BigDecimal b1 = new BigDecimal("2.0");
		BigDecimal b2 = new BigDecimal("1.1");
		System.out.println(b1.subtract(b2));
		
	}

}
