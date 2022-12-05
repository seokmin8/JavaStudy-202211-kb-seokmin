package j21_문자열메소드;

public class StringMethod2 {

	public static void main(String[] args) {

		String rolesStr = "ROLE_USER, ROLE_MANAGER, ROLE_ADMIN";

		String[] roleArray = new String[3];
		String[] roleArray1 = new String[3];

		roleArray = rolesStr.split(", ");
		// , 기준으로 구분
		for (int i = 0; i < roleArray.length; i++) {
			System.out.println(roleArray[i]);
		}
		
		System.out.println("-----1-----");

		String tempRoles = rolesStr;
		roleArray1[0] = tempRoles.substring(0, tempRoles.indexOf(",") != -1 ? tempRoles.indexOf(",") : tempRoles.length());
		// tempRoles를 자른다(substring) 어디부터? 0 (시작)부터 "," 전까지
		tempRoles = tempRoles.substring(tempRoles.indexOf(",") + 2);
		// ,부터 +2는 쉼표 뒤 R부터 앞부분은 날려주고 뒤를 자른다 끝까지
		roleArray1[1] = tempRoles.substring(0, tempRoles.indexOf(",") != -1 ? tempRoles.indexOf(",") : tempRoles.length());
		tempRoles = tempRoles.substring(tempRoles.indexOf(",") + 2);
		roleArray1[2] = tempRoles.substring(0, tempRoles.indexOf(",") != -1 ? tempRoles.indexOf(",") : tempRoles.length());
		// 마지막은 쉼표가 없다? (( -1 = 해당 인덱스를 찾지 못했을 때 )) 아니면 , 를 찾고 그게 아니면??
		
		for(String role : roleArray) {
			System.out.println(role);
		}
		
		System.out.println("-----2-----");
		
		String[] roleArray2 = rolesStr.split(", ");
		// 쉼표 띄어쓰기 기준으로 
		for (String role : roleArray2) {
			System.out.println(role);
		}
		// 만약 string 문자열에 띄어쓰기가 없을 때!?
		String roles = "ROLE_USER, ROLE_MANAGER,ROLE_ADMIN";
		// 다른 문장에 들어있는 띄어쓰기를 다 없애주는 작업!
		
		
	}

}
