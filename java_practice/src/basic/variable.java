package basic;

public class variable {
	public static void main(String[] args) {
		// 1번 예제
		int i = Integer.MAX_VALUE;
		int i2 = i+1;
		System.out.println(i2);
		// 예상 : 오버플로우로 음수에서 제일 작은 값 호출 
		// 결과 : -2147483648
		
		// 원하는 결과를 얻어보자
		int i3 = Integer.MAX_VALUE;
		long i4 = i3+1; 
		System.out.println(i4);
		// 잘못된 결과 : i3(int)+1 인 시점에서 이미 오버플로우  
		
		i4 = (long)i3+1;
		System.out.println(i4);
		// 원하는 값을 얻었다 
	}
}
