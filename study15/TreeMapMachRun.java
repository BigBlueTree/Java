package study15;

import java.util.Iterator;
import java.util.Map.Entry;

import study15.Member;

import java.util.TreeMap;

public class TreeMapMachRun {
	public static void main(String[] args) {
		TreeMap<Integer, Integer> tmap1 = new TreeMap<>();
		Integer intVal1 = new Integer(30);
		Integer intVal2 = new Integer(30);
		tmap1.put(intVal1, 1);
		tmap1.put(intVal2, 3);
		System.out.println(tmap1);
		
		TreeMap<String, String> tmap2 = new TreeMap<>();
		String str1 = new String("당신");
		String str2 = new String("당신");
		tmap2.put(str1, "you");
		tmap2.put(str2, "We");
		System.out.println(tmap2);
		
		CompareMemberTreeMap ctm = new CompareMemberTreeMap();
		Member lee = new Member(101,"이순신",45);
		Point leep = new Point(1000);
		ctm.addMember(lee,leep);
		Member koo = new Member(102,"구준표",18);
		Point koop = new Point(1100);
		ctm.addMember(koo,koop);
		Member song = new Member(103,"송시열",32);
		Point songp = new Point(1200);
		ctm.addMember(song,songp);
		Member song2 = new Member(103,"둘리",200);
		ctm.addMember(song2, koop);
		ctm.showAll();
		if(ctm.removeMember(101)) {
			System.out.println("삭제완료");
		}else {
			System.out.println("해당 아이디가 존재하지 않습니다.");
		}
		ctm.showAll();
	}
}
class CompareMemberTreeMap{
	private TreeMap<Member,Point> tmap;
	
	public CompareMemberTreeMap() {
		tmap = new TreeMap<Member,Point>();
	}
	public void addMember(Member member,Point point) {
		tmap.put(member, point);
	}
	public void showAll() {
		for(Entry<Member,Point> entry:tmap.entrySet()) {
			Member m = entry.getKey();
			Point p = entry.getValue();
			System.out.println(m.toString());
			System.out.println(p.toString());
		}
	}
	public boolean removeMember(Integer memberId) {
		//for
//		for(Member mem:tmap.keySet()) {
//			if(mem.getMemberId()==memberId) {
//				tmap.remove(mem);
//				return true;
//			}
//		}
//		return false;
		//iterator
		Iterator<Member> members = tmap.keySet().iterator();
		while(members.hasNext()) {
			Member mem = members.next();
			if(mem.getMemberId()==memberId) {
				tmap.remove(mem);
				return true;
			}
		}
		return false;
		
	}
	
	public TreeMap<Member,Point> getTmap() {
		return tmap;
	}
	public void setTmap(TreeMap<Member,Point> tmap) {
		this.tmap=tmap;
	}
	
}


















