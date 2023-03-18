package study15;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapInterfaceRun {
	public static void main(String[] args) {
		Map<Integer,String> hashMap = new HashMap<>();
		hashMap.put(103, "lee");
		hashMap.put(102, "kim");
		hashMap.put(101, "kim");
		hashMap.put(102, "hong");
		System.out.println(hashMap);
		System.out.println(hashMap.size());
		
		Map<Integer,String> hashtable = new Hashtable<>();
		hashtable.put(103, "lee");
		hashtable.put(102, "kim");
		hashtable.put(101, "kim");
		hashtable.put(102, "hong");
		System.out.println(hashtable);
		System.out.println(hashtable.size());
		
		Map<Integer,String> linkedHashMap = new LinkedHashMap();
		linkedHashMap.put(103, "lee");
		linkedHashMap.put(102, "kim");
		linkedHashMap.put(101, "kim");
		linkedHashMap.put(102, "hong");
		System.out.println(linkedHashMap);
		System.out.println(linkedHashMap.size());

		Map<Integer,String> treeMap = new TreeMap();
		treeMap.put(103, "lee");
		treeMap.put(102, "kim");
		treeMap.put(101, "kim");
		treeMap.put(102, "hong");
		System.out.println(treeMap);
		System.out.println(treeMap.size());
	}
}
