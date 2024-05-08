package CollectionFramework;

import java.util.HashSet;
import java.util.Set;

public class SetTest {

	Set<Object> hset = new HashSet<>();
	// hset.add(1); 궁금한게 왜 여기구문에서 바로 추가하려고 하면 안되는지?
	private void addMethod() {
		hset.add(1);
		hset.add("hello");
		hset.add("hello"); // 동일한 데이터 추가 X
		hset.add(1); // 기본형은 wrapper를 통해 추가
		System.out.println("결과 : "+hset);
		// SmartPhone 타입의 객체를 추가해보자
		
		SmartPhone sp1 = new SmartPhone("010"); 
		SmartPhone sp2 = new SmartPhone("010"); 
		
		System.out.println(sp1.equals(sp2)); // false
		
		hset.add(sp1);
		hset.add(sp2);
		
		System.out.println("결과 : "+hset);

		
	}
	private void retrieveMethod() {
		System.out.println("데이터 개수 : " + hset.size());
		
		for(Object sobj : hset) {
			System.out.println("데이터 조회" +sobj);
		} 
	}
	private void removeMethod() {
		hset.remove("hello");
		System.out.println("결과 : "+hset);
		
	}
	
	public static void main(String[] args) {
	SetTest test = new SetTest();
	test.addMethod();
	test.retrieveMethod();
	test.removeMethod();
	}
}
