package j15_제네릭;

import lombok.Getter;

public class Information<T> {
    // Info <? extends Object> => 자료형에는 object를 상속받은 애들만 들어갈 수 있음!!
    // 부모클래스도 들어갈 수 있음!
    // <?> 에서 extends는 하위로! super는 상위로
    // implements는 없음!, super적용됨 (나자신과 부모만!)
    // 


    @Getter
    private T target;
    // T = 매개변수 같은 의미

    public Information(T target){
        this.target = target;
    }

    public void printInfo(){
        System.out.println(target); // target에 ToString한것?
    }
}
