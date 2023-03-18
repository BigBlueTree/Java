package study13;

class WildClass<T extends Comparable<T>>{}
class WildClass2<T extends Comparable<? super T>>{}

class Person{}
class Student extends Person implements Comparable<Person>{
	@Override
	public int compareTo(Person o) {return 0;}
}
class Student2 implements Comparable<Student2>{
	@Override
	public int compareTo(Student2 o) {return 0;}
}

public class WildCardRun {
	public static void main(String[] args) {
		//WildClass<Student> a = new WildClass<>();
		WildClass<Student2> b = new WildClass<>();
		WildClass2<Student> c = new WildClass2<>();
	}
}











