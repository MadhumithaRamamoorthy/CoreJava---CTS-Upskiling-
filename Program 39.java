import java.lang.reflect.*;

class Demo {

    public void display() {

        System.out.println(
            "Reflection Example"
        );
    }
}

public class ReflectionDemo {

    public static void main(String[] args)
            throws Exception {

        Class<?> cls =
            Class.forName("Demo");

        Object obj =
            cls.getDeclaredConstructor()
               .newInstance();

        Method methods[] =
            cls.getDeclaredMethods();

        for(Method m : methods) {

            System.out.println(
                m.getName()
            );

            m.invoke(obj);
        }
    }
}
