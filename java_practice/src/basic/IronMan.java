package basic;

public class IronMan implements Heroable{

	// interface를 사용할때는 class에서 implements 키워드를 사용하여 정의 
	// implements한 interface의 method를 재정의 하지 않을경우 abstract 키워드를 사용,
	// 아닐경우 오버라이드를 통해 재정의 필요 
	@Override
	public void fight() {
		// TODO Auto-generated method stub
	System.out.println("변신");
	}

	@Override
	public void changeShape() {
		// TODO Auto-generated method stub
	System.out.println("땅 ");
	}

	@Override
	public void upgrade() {
		// TODO Auto-generated method stub
		System.out.println("짜");
	}
	

}
