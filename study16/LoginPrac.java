package study16;

import java.util.HashMap;
import java.util.Map;

class NoExistIDException extends Exception{
	public NoExistIDException() {}
	public NoExistIDException(String message) {
		super(message);
	}
}
class WrongPasswordException extends Exception{
	public WrongPasswordException() {}
	public WrongPasswordException(String message) {
		super(message);
	}
}
public class LoginPrac {
	public static void main(String[] args) {
		try {
			login("apple","1234");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			login("java","2345");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	static void login(String id,String pw) throws Exception{
		Map<String, String> mem = new HashMap<>();
		String[] idArr= {"ajax","java","script","css"};
		String[] pwArr= {"1234","3424","2345","3456"};
		for(int i=0;i<idArr.length;i++) {
			mem.put(idArr[i],pwArr[i]);
		}
		if(!mem.containsKey(id)) {
			throw new NoExistIDException("아이디가 존재하지 않습니다.");
		}else if(mem.containsKey(id)&&!mem.get(id).equals(pw)) {
			throw new WrongPasswordException("암호가 틀립니다.");
		}else {
			System.out.println("로그인 완료.");
		}
	}
	static void login2(String id,String pw) throws Exception{
		String[] idArr= {"ajax","java","script","css"};
		String[] pwArr= {"1234","3424","2345","3456"};
		int index=-1;
		for(int i=0;i<idArr.length;i++) {
			//아이디 체크
			if(idArr[i].equals(id)) {
				index=i;
			}
		}
		if(index<0) {
			throw new NoExistIDException("아이디가 존재하지 않습니다.");
		}else if(!pwArr[index].equals(pw)) {
			throw new WrongPasswordException("암호가 틀립니다.");
		}else {
			System.out.println("로그인 완료.");
		}
	}
}




