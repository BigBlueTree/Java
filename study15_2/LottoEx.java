package study15_2;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class LottoEx {
	Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		//로또 번호의 출력
		new LottoEx().lottoStart();
//		LottoEx lotEx = new LottoEx();
//		lotEx.lottoStart();
	}
	//해당 동작의 주요실행
	public void lottoStart() {
		//반복 시작
		while(true) {
			//탈출조건 -> 메뉴
			//메뉴 출력(구매,종료)
			lottoMenu();
			//메뉴 입력
			System.out.print("메뉴선택:");
			int menu = scan.nextInt();
			if(menu==2) {
				System.out.println("종료");
				break;
			}else if(menu==1) {
				//구입금액입력
				//로또 번호 생성
				//기타 정보
				getLotto();
			}else {
				System.out.println("번호입력오류");
			}
		//반복 끝
		}
	}
	public void getLotto() {
		//구입금액입력
		System.out.print("금액입력:");
		int money = scan.nextInt();
		if(money<1000) {
			System.out.println("1000원이 안됩니다.");
			return;
		}else if(money>100000) {
			System.out.println("십만원 초과 금액은 구매불가");
			return;
		}
		//로또 번호 생성
		makeLotto(money);
		//기타 정보
		System.out.println("받은 금액:"+money+"원");
		System.out.println("거스름돈:"+(money%1000)+"원");
	}
	public void makeLotto(int money) {
		ArrayList<TreeSet<Integer>> lottoList = new ArrayList<>();
		//로또 번호 생성->로또 출력
		int count = money/1000;
//		for(int i=0;i<count;i++) {
//			TreeSet<Integer> lottoSet = new TreeSet<>();
//			while(lottoSet.size()<6) {
//				lottoSet.add((int)(Math.random()*45+1));
//			}
//			lottoList.add(lottoSet);
//		}
		System.out.println("로또 번호 출력");
//		for(int j=0;j<lottoList.size();j++) {
//			System.out.println("로또번호"+(j+1)+":"+lottoList.get(j));
//		}
		for(int i=0;i<count;i++) {
			TreeSet<Integer> lottoSet = new TreeSet<>();
			while(lottoSet.size()<6) {
				lottoSet.add((int)(Math.random()*45+1));
			}
			System.out.println("로또번호:"+lottoSet);
		}
	}
	public void lottoMenu() {
		System.out.println("Lotto 판매점");
		System.out.println("==메뉴======");
		System.out.println("1.Lotto 구입");
		System.out.println("2.종  료");
		System.out.println("===========");
	}
}







