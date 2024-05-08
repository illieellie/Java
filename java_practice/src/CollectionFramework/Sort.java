package CollectionFramework;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sort obj = new Sort();
		//obj.basicSort();
		//obj.sortPhone();
		obj.stringLengthSort();
	}
	
	private List<String> names = Arrays.asList("Hi", "Hello", "Welcome", "World");
	
	public void basicSort() {
		Collections.sort(names);
		System.out.println(names);
	}
	
	public void sortPhone() {
		List<SmartPhone> phones = Arrays.asList(new SmartPhone("010"), new SmartPhone("111"), new SmartPhone("001"));
	
		Collections.sort(phones); // T extends Comparable을 상속받는 type에 대해서만 sort 사용 가능 
		System.out.println(phones);
	}
	
	public void stringLengthSort() {
		// 문자열 길이에 따라 정렬 (정렬 기준 세움)
		Collections.sort(names, new StringLengthComparator());
		System.out.println(names);
	}
	
	


}
