package CollectionFramework;

public class SmartPhone implements Comparable<SmartPhone>{
String number;

public SmartPhone(String number) {
	this.number = number;
}

public String toString() {
	return "전화 번호 : " + number;
}

@Override
public int compareTo(SmartPhone o) {
	
	return number.compareTo(o.number);
}

}
