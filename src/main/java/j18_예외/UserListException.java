package j18_예외;

import java.util.ArrayList;
import java.util.List;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
class User {
// 서브클래스
	private String username;
	private String password;
}

public class UserListException {
// public이 붙어있는 class 명이 파일명과 같다
	
	public static void main(String[] args) {
		List<User> userList = new ArrayList<>();

		userList.add(new User("aaa", "1111"));
		userList.add(new User("bbb", "2222"));
		userList.add(new User("ccc", "3333"));
		userList.add(new User("ddd", "4444"));
		userList.add(null);
		
		int length = userList.size();
		
		System.out.println("------------ 시작 -----------");
		
		try {
			for (int i = 0; i < length; i++) {
				System.out.println(userList.get(i));
			}
			for (int i = 0; i < length; i++) {
				System.out.println("username : " + userList.get(i).getUsername());
				System.out.println("password : " + userList.get(i).getPassword());
				System.out.println("------------ 2 -----------");
			}
			
		} catch(IndexOutOfBoundsException indexOutOfBoundsException) {
			length -= 1;
			System.out.println(indexOutOfBoundsException.getMessage());
			
			try {
				for (int i = 0; i < 6; i++) {
					System.out.println("username : " + userList.get(i).getUsername());
					System.out.println("password : " + userList.get(i).getPassword());
					System.out.println("------------ 3 -----------");
				}
				
			} catch(NullPointerException nullPointerException) {
				System.out.println(nullPointerException.getMessage());
				System.out.println("------------ 4 -----------");
			}
			
		} catch (NullPointerException nullPointerException) {
			System.out.println(nullPointerException.getMessage());
			
			System.out.println("------------ nullpoint 끝 -----------");
			
		} catch (Exception e) {
			e.printStackTrace(); // 마지막 예외에 대한 log 기록 및 출력
			// catch의 맨 마지막에 들어와야 하는 catch (Exception e) <<< 최상위 예외
			// 예상치 못한 예외까지도 처리해주고 예외에 대한 log 기록을 남긴다!
			
		} finally {
			// 예외 실행여부에 관계없이 무조건 실행된다
			// 발생해도 실행, 예외가 없어도 실행
			// 자동백업 등 예상치 못한 작동에 대비할 수 있다
			System.out.println("무조건 실행됨!");
		}
		System.out.println("예외처리가 되지 않으면 여기는 실행안됨");
		System.out.println("프로그램 정상 종료");
	}

}
