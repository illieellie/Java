package CollectionFramework;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapTest {

	
	Map map = new HashMap();
	public static void main(String[] args) {
		MapTest map = new MapTest();
		map.addMethod();
		map.retrieveMethod();
		map.removeMap();
	}

	private void addMethod() {
		System.out.println("추가 성공?" + map.put("andy", "1234"));
		System.out.println("추가 성공?" + map.put("andy", "4567"));
		// 동일한 Key에 put하면 데이터가 수정됨
		
		map.put("kate", "9999");
		// 기존에 해당 키에 대한 값이 없을 때만 추가하기 
		map.putIfAbsent("kate", "4444");
		System.out.println("결과 : " +map);
	}
	
	private void retrieveMethod(){
		System.out.println(map.get("kate"));
		System.out.println(map.containsKey("kate"));
	
		Set<String> keys = map.keySet(); // key
		System.out.println(keys);
		
		for(String obj : keys)
		{
			System.out.println(obj+" : "+ map.get(obj));
		}
		
		Set<Entry<String, String>> entry = map.entrySet();
		for(Entry obj : entry)
		{
			System.out.println(obj.getKey() +" : " + obj.getValue());
			System.out.println(obj);
		}	
	}
	
	private void removeMap() {
		map.remove("andy");
		System.out.println(map);
		map.clear();
		System.out.println(map);
	}
	
}
