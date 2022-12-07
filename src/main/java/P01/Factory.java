package P01;

import java.util.Scanner;

import lombok.Getter;

class Factory {
	
	private String factoryName;
	
	Factory(String fName) {
		factoryName = fName;
	}

	@Getter
	private static Factory ft = null;
	
	public void inputName() {
		String name = null;
		Scanner sc = new Scanner(System.in);
				
		
		System.out.println("이름을 입력하세요 : ");
		name = sc.nextLine();
	}
	
	public static Factory getFt() {
		
		if(ft == null) {
			ft = new Factory(null);
		}
		return ft;
		
	}
	
}
