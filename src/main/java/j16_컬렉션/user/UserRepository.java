package j16_컬렉션.user;

import java.util.List;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Getter;

/*
 *  user정보의 Map을 담을 수 있는 userList
 */

@AllArgsConstructor
public class UserRepository {
	
	@Getter
	private List<Map<String, Object>> userList;
	// 생성자 멤버변수.
	
	
	// Create
	public void register(Map<String, Object> userMap) {
		// userMap을 받는다 add!!
		System.out.println("사용자 등록");
		userList.add(userMap);
	}
	// Read
	public Map<String, Object> findUserByUsername(String username){
		// id를 이용해서 user를 찾아달라
		Map<String, Object> userMap = null;
		
		for(Map<String, Object> user : userList){
			String _username = (String)user.get("username");
			// Map안에 들어있는 key값 username (매개변수 username과 다름)
			if(_username.equals(username)) {
				userMap = user;
				break;
			}
		}
		// 변수명 앞에 _가 붙으면 임시적 변수명이란 뜻
		
		return userMap;
	}
	
	// Update
	public void modifyPasswordByUsername(String username, String newPassword) {
		// id는 username으로 찾아서 pw를 바꿔라! (map에서 찾아라)
		Map<String, Object> userMap = findUserByUsername(username);
		// 찾았는데 만약 null 이면?
		if(userMap == null) {
			System.out.println("해당 username으로 사용자를 찾을 수 없습니다 ");
			return;
			// void 이지만 return이 되면 해당 메소드를 빠져나간다!
		}
		userMap.replace("password", newPassword);
		
	}
	
	// Delete
	public void deleteUserByUsername(String username) {
		// List에서 user 자체를 삭제하는 메소드!
		// 해당 user가 위치하고 있는 index가 필요하다
		// indexOf로 index를 찾는다
		Map<String, Object> userMap = findUserByUsername(username);
		
		if(userMap == null) {
			System.out.println("해당 username으로 사용자를 찾을 수 없습니다 ");
			return;
		}
		int userIndex = userList.indexOf(userMap);
		
		userList.remove(userIndex);
		// remove(0) <<< 0값이 되면 첫번째만 무조건 삭제
		
	}

	
	
}
