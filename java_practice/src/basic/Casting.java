package basic;

public class Casting {

		public void safecasting(){
		Object obj = 1;
		System.out.println(obj.getClass());

		if(obj instanceof String)
		{
		String s = (String) obj; // string type 이라면 변환 
		System.out.println(s.length());
		}
		else
		{
		System.out.println("string형이 아니다");
		}
		}	
}


