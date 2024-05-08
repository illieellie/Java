package interfacePrc;

public class LazerPrinter implements Printer {

	@Override
	public void print(String fileName) {	
		System.out.println(fileName + " 문서를 Lazer Printer로 프린트한다.");
	}

}
