package study19;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.ToIntBiFunction;

class Student{
	private String name;
	private String city;
	private Integer age;
	//생성자 매개변수 1개, 2개, 3개
	public Student(String name) {
		this.name=name;
	}
	public Student(String name,String city) {
		this(name);
		this.city=city;
	}
	public Student(String name,String city,Integer age) {
		this(name,city);
		this.age=age;
	}
	//toString 이름(도시,나이)
	@Override
	public String toString() {
		return name+"("+city+","+age+")";
	}
	//getter,setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
}

public class StudentInfoRun {
	public static void main(String[] args) {
		//Function name 객체 Student
		Function<String, Student> func1 = 
				new Function<String, Student>() {
			@Override
			public Student apply(String name) {
				return new Student(name);
			}
		};
		Student stu1 = func1.apply("소주");
		
		BiFunction<String, String, Student> func2 = 
				(name,city)->new Student(name,city);
		//Student::new;
		Student stu2 = func2.apply("막걸리", "서울");
		
		stu1.setAge(15);
		stu1.setCity("서울");
		stu2.setAge(16);
		
		System.out.println(stu1.toString()+"||"+stu2.toString());
		
		//두 학생의 10년 후 나이를 출력
		IntBinaryOperator oper;
		oper = new IntBinaryOperator() {
			@Override
			public int applyAsInt(int x, int y) {
				return StudentInfoRun.staticSum(x,y);
			}
		};
		oper=(x,y)->StudentInfoRun.staticSum(x,y);
		oper=StudentInfoRun::staticSum;
		int tenYearAge = oper.applyAsInt(stu1.getAge(), 10);
		System.out.println(stu1.getName()+" 10년 후 나이:"+tenYearAge);
		
		StudentInfoRun sir = new StudentInfoRun();
		oper = (x,y)->sir.instanceSum(x,y);
		oper = sir::instanceSum;
		tenYearAge = oper.applyAsInt(stu2.getAge(),	10);
		System.out.println(stu2.getName()+" 10년 후 나이:"+tenYearAge);
		
		ToIntBiFunction<String, String> func3 = 
				(city1,city2)->city1.compareTo(city2);
		compareResult(
				func3.applyAsInt(stu1.getCity(), stu2.getCity()));
	}
	public static int staticSum(int x,int y) {
		return x+y;
	}
	public int instanceSum(int x,int y) {
		return x+y;
	}
	public static void compareResult(int result) {
		if(result==0) {
			System.out.println("동일 문자열");
			return;
		}
		System.out.println("동일하지 않은 문자열");
	}
}











