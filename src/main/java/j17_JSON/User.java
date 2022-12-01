package j17_JSON;

import com.google.gson.annotations.Expose;

import lombok.Builder;
import lombok.Data;

/*	
 * serialize () => Object 에서 Json 으로 변환할 때 해당 데이터를 보낼지 말지
 * deserialize () => Json에서 Object로 갈 때 true, false값으로 설정
 * key값은 통신상태에서는 전달되게 하지 않는다.
 * JWT json Web Token 데이터를 암호화 해준다	
 */	

@Builder
@Data
public class User {
	@Expose(serialize = true, deserialize = true)
	private String username;
	// json에서 다시 객체(obj)화 할 때 숨기고 싶다면 (des...=false) => null값으로 출력
	@Expose(serialize = false, deserialize = false)
	//(serialize = ) json형태로 변환할 때 
	private String password;	
	// pass를 보이기 싫을때? @Expose (s..=false)
	// 하나의 멤버에 설정을 하면 모든 멤버에 true값을 부여해야 함
	@Expose(serialize = true, deserialize = false)
	private String name;
	@Expose(serialize = true, deserialize = true)
	private String email;
	
}
