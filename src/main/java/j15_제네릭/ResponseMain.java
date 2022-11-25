package j15_제네릭;

public class ResponseMain {

    public static CMRespDto<?> response(String msg, Object data){
        // <?> 안에 어떤 자료형이 들어올지 모른다
        // 반환되는 자료형과 일치해야한다.
        return new CMRespDto<>(msg, data);
        // <> student는 object가 아니기때문에 obj사용불가! 다운캐스팅을 해야한다
    }

    public static void main(String[] args) {
        Student student = Student.builder()
                .studentCode(2020)
                .name("감자")
                .build();

        System.out.println(response("학생데이터 응답", student));
        System.out.println(response("student code error!!", "학번에 오류가 있습니다."));
    }
}
