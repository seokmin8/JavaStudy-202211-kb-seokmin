package j13_Object;

// 서비스로직 - 기능들을 담고있는 객체 ! ( MVC, + , - , x , 암호화, 변환, 등등)
// Entity - 정보를 담고있는 객체 ( 학년, 이름, 생일 등등 , DTO, VO)

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
//@Getter
//@Setter
//@EqualsAndHashCode
//@ToString
@Data
// @Data가 위의 4가지를 다 가지고 있는 어노테이션!!

public class Entity {
    private String name;
    private int age;
    private String address;

    public boolean cmp() {
        return this.getClass() == Entity.class;
        // 생성된 객체.의 클래스(Class.getClass) == 엔티티.클래스의 정보( Class.class)
    }
}


