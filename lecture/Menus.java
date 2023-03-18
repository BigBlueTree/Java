package lecture;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Menus{
	private List<String> title = new ArrayList<>();
	private Map<String, String[]> menu = new HashMap<>();
	Menus(){
		File file = new File(System.getProperty("user.dir")+"/src/lecture/menulist.txt");
		try(
			Reader reader = new FileReader(file);
			BufferedReader br = new BufferedReader(reader);
		){
			String data;
			while((data=br.readLine())!=null) {
				List<String> temp = Stream.of(data.split(",")).collect(Collectors.toList());
				title.add(temp.get(0));
				menu.put(temp.get(0),temp.subList(1, temp.size()).toArray(new String[0]));
			}
		}catch (IOException e) { e.printStackTrace(); }
//		System.out.println(title);
//		menu.forEach((t, u) -> {System.out.println(t);
//			for(String s:u) {
//				System.out.println(s);
//			};});
	};
	public String[] getMenu(String key){
		return menu.get(key);
	}
	public List<String> getTitle(){
		return title;
	}
	
}
