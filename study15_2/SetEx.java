package study15_2;

import java.util.*;

public class SetEx {
	public static void main(String[] args) {
		TreeSet<Student> tSet = new TreeSet<>();
		//값 추가
		tSet.add(new Student("lee",96));
		Student hong = new Student("hong",86);
		tSet.add(hong);
		tSet.add(new Student("song",92));
		Student student = tSet.last();
		System.out.println("최고 점수:"+student.score);
		System.out.println("최고 득점자:"+student.name);
	}
}
class Student implements Comparable<Student>{
	String name;
	int score;
	Student(String name,int score){
		this.name=name;
		this.score=score;
	}
	@Override
	public int compareTo(Student student) {
		//return this.score-student.score;
		if(this.score>student.score) {
			return 1;
		}else if(this.score==student.score) {
			return 0;
		}else {
			return -1;
		}
//		return (this.score>student.score)?1:((this.score==student.score)?0:-1);
		
	}
	
}



