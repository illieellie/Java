package basic;

public class Person {
int age;
String name;

public Person(String name, int age)
{
this.name = name;
this.age = age;	
}


public void printInfo()
{
	System.out.println("반복수행하는 기능은 함수로 수행하자!");
	System.out.println("저는 "+name+","+age+"살 입니다.");
}


}
