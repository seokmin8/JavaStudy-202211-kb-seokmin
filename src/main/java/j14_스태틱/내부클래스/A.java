package j14_스태틱.내부클래스;

import lombok.Getter;

public class A {

    public class B{
        @Getter
        private String name;

        public B(String name) {
            this.name = name;
        }
    }
}
