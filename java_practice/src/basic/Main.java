package basic;

public class Main {

	public static void main(String[] args) {
	IronMan iman = new IronMan();
	Object obj = iman;
	
	Fightable f = iman;
	Transformable t = iman;
	Heroable h = iman;
	
	// interface를 사용하면 polymorphism을 많이 가질 수 있는 장점이 있다.
	
}
}


