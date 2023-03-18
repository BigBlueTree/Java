package lecture;

public class MenuUseEx {
	public static void main(String[] args) {
		Menus menus = new Menus();
		SelectMenu input = new SelectMenu();
		int selInt = 0;
		String selStr = "";
		String menu="main";
		//menu
		while(true) {
			printMenu(menu,menus.getMenu(menu));
			selInt = input.readInt();
			if(selInt==1) {
				menu="sub1";
			}else if(menu.equals("main") && selInt==4) {
				break;
			}else if(menu.equals("sub1") && selInt==4) {
				menu="main";
			}
		}
				
	}
	public static void printMenu(String title,String[] options) {
		System.out.println("======"+title+"======");
		for(String option:options) {
			System.out.println(option);
		}
		System.out.print("선택:");
	}
}
