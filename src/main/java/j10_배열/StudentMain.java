package j10_배열;

public class StudentMain {

    public static void main(String[] args) {

        Student[] students = new Student[3]; // student가 3명이 만들어진게 아니다
        // Student 주소값을 담을 수 있는 공간3개를 생성! (의자3개만 두는것)
        // Class 도 자료형이다!
        students[0] = new Student("임지현", 1);
        students[1] = new Student("신경수", 2);
        students[2] = new Student("고희주", 3);

//        System.out.println("이름 : 000, 학년 : i");
        //해당 주소값의 get을 불러오면 출력!
        for(int i=0; i < students.length; i++){
            System.out.println("이름 : "+students[i].getName() + ", 학년 : " + students[i].getYear());
        }

    }
}
