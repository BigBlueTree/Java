package study15_2;

public class GenericEx {
	public static void main(String[] args) {
		Integer[] intArr = {1,2,3};
		String[] strArr = {"Hello","World"};
		printArray(intArr);
		printArray(strArr);
		/*
		 * 1
		 * 2
		 * 3
		 * Hello
		 * World
		 */
	}
	public static<T> void printArray(T[] inputArray ) {
		for(T ele:inputArray) {
			System.out.println(ele);
		}
	}
}
