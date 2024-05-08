package CollectionFramework;

import java.util.ArrayList;
import java.util.List;

public class ListTest {

	// 리스트 생성
	List<String> friends = new ArrayList<>();
	//List<String> friends = new LinkedList<>();
	
	public static void main(String[] args) {
		
	// 객체 생성 
	ListTest alt = new ListTest();
	alt.createTest(null);
	alt.retrieveTest();
	alt.updateTest();
	alt.deleteTest();
	
	}
	
	void createTest(String a)
	{
		// 이름 추가
		friends.add("김예솔");
		friends.add("치유");
		friends.add(1, "공유"); // 위치 지정 가능
		System.out.println("요소" + friends);
		
	}
	void retrieveTest()
	{
		// 비어있는지, size
		System.out.println(friends.isEmpty()+":"+friends.size());
		// 반복문 순회
		for(String name : friends) {
		System.out.println(name);
	}
		// 특정 문자가 있는지 (없으면 -1)
		System.out.println(friends.indexOf("ㅁ")+","+friends.lastIndexOf("김예솔"));
	}
	void updateTest()
	{
		int idx = friends.indexOf("공유");
		if(idx!=-1) {
		friends.set(idx,"제이");
		}
	System.out.println("수정 후 :" + friends);
	}
	void deleteTest()
	{
		System.out.println(friends.remove(0));
		System.out.println(friends.remove("치유"));

		System.out.println("삭제 후 :" + friends);
	}

}
