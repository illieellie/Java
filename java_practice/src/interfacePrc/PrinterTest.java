package interfacePrc;

public class PrinterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PrintClient user = new PrintClient();

		// (+) DotPrinter 로 출력하던 걸 LazerPrinter를 사용하도록 코드를 변경시켜보자 
		//user.setPrinter(new DotPrinter());
		user.setPrinter(new LazerPrinter());
		user.printThis("abc.doc");
		// Client의 코드는 변화한게 없고 새로운 Print만 넘겨줌 
		
	}

}
