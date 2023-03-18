package study15_2;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class AnagramEx {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		boolean result = isAnagram(a,b);
		System.out.print("두 단어는 ");
		System.out.println(
				result?"Anagram이다.":"Anagram이 아니다.");
	}
	static boolean isAnagram(String a, String b) {
//		char[] ac = a.toCharArray();
//		char[] bc = b.toCharArray();
//		Arrays.sort(ac);
//		Arrays.sort(bc);
//		System.out.println(ac);
//		System.out.println(bc);
//		System.out.println(ac.equals(bc));
//		System.out.println(Arrays.equals(ac, bc));
//		return (Arrays.equals(ac, bc))?true:false;
		String[] aa = a.split("");
		String[] ba = b.split("");
		ArrayList<String> al = new ArrayList<>();
		ArrayList<String> bl = new ArrayList<>();
		al.addAll(Arrays.asList(aa));
		bl.addAll(Arrays.asList(ba));
		Collections.sort(al);
		Collections.sort(bl);
		return al.equals(bl)?true:false;
	}
}








