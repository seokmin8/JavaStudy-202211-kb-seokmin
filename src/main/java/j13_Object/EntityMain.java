package j13_Object;

public class EntityMain {

    public static void main(String[] args) {
        Entity entity = new Entity("석민", 3, "부산 북구 구포");
        Entity entity2 = new Entity("석민", 3, "부산 북구 구포");

        System.out.println(entity);
        System.out.println(entity.equals(entity2));

        System.out.println(entity.hashCode());
        System.out.println(entity2.hashCode());

        System.out.println(entity.getAddress());

        System.out.println(Entity.class);
        Class c = Entity.class;
        Object obj = new Student(20221101, "석민");

        System.out.println(Entity.class == entity.getClass());
        // instaceof 와 같은 명령
        System.out.println(Entity.class.equals(obj.getClass()));
        // student클래스는 entity 클래스와 다르다
        System.out.println(obj instanceof Entity);
    }
}
