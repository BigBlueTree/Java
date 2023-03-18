package test2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest4 {
	public static void main(String[] args) {
		Student[] students = new Student[]{
                new Student("강민정", true, 1, 1, 300),
                new Student("장아름", false, 1, 1, 250),
                new Student("공승환", true, 1, 1, 200),
                new Student("권비", false, 1, 2, 150),
                new Student("김민석", true, 1, 2, 100),
                new Student("박호진", false, 1, 2, 50),
                new Student("배민국", false, 1, 3, 100),
                new Student("성우석", false, 1, 3, 150),
                new Student("송현동", true, 1, 3, 200),
                new Student("강민정", true, 2, 1, 300),
                new Student("장아름", false, 2, 1, 250),
                new Student("공승환", true, 2, 1, 200),
                new Student("권비", false, 2, 2, 150),
                new Student("김민석", true, 2, 2, 100),
                new Student("박호진", false, 2, 2, 50),
                new Student("배민국", false, 2, 3, 100),
                new Student("성우석", false, 2, 3, 150),
                new Student("송현동", true, 2, 3, 200)
        };
		StreamTest4 st = new StreamTest4();
		System.out.print("남자: ");
		System.out.println(st.question1(students).get(true));
		System.out.print("여자: ");
		System.out.println(st.question1(students).get(false));
		Map<Integer,Map<Integer,Integer>> t = st.question2(students);
		for(Integer grade:t.keySet()) {
			System.out.println(grade+"학년 ");
			for(Integer ban:t.get(grade).keySet()) {
				System.out.println(ban+"반 "+t.get(grade).get(ban));
			}
		}
	}
// 150점 미만 학생을 남자와 여자로 구별하여 표시(Boolean,List)
	public Map<Boolean,List<Student>> question1(Student[] stuArr){
		return Arrays.stream(stuArr)
			.filter(s->s.getScore()<150)
			.collect(Collectors.groupingBy(Student::getIsMale));
	}
// 각 반별 총점을 학년 별로 나누어 구하라.
	public Map<Integer,Map<Integer,Integer>> question2(
			Student[] stuArr){
		return Stream.of(stuArr)
			.collect(Collectors.groupingBy(
				Student::getGrade,Collectors.groupingBy(
					Student::getBan,Collectors.summingInt(
						Student::getScore))));
	}
}











