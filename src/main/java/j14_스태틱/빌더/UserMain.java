package j14_스태틱.빌더;

public class UserMain {
    public static void main(String[] args) {

        User user = User.builder()
                .username("seokmin")
                .password("1234")
                .email("meddo@naver")
                .name("석민")
                .build();
        // .을 찍는것은 앞의 값이 주소란것!

        System.out.println(user);
    }
}
