package basic;

public class MorePerson extends Person{

	public MorePerson(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void printInfo() {
		System.out.println("저는 더 발전된 출력 기능입니다.");
	}

}
