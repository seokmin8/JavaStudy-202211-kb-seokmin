package j15_제네릭;

import lombok.Getter;

public class Information2 {
    @Getter
    private  Object target;

    // 생성자의 매개변수가 Object 이다!!!!
    public Information2(Object target) {
        this.target = target;
    }

    public void printInfo(){
        System.out.println(target);
    }

}
