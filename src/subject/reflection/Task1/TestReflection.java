package subject.reflection.Task1;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class TestReflection {
    public static void main(String[] args) throws ClassNotFoundException {
        Person person = new Person();

        Class personClass1 = Person.class; // 1 ������
        Class personClass2 = person.getClass(); // 2 ������
        Class personClass3 = Class.forName("subject.reflection.Task1.Person"); // 3 ������

        // ������
        Method[] methods = personClass1.getMethods();
        for (Method method : methods) {
            System.out.println(method.getName() + ", " + method.getReturnType() +
                    ", " + Arrays.toString(method.getParameterTypes()));
        }

        // ����
        // getFields() -> ����� ��������� �����, getDeclaredFields() -> ����� ��������� � ��������� �����
        Field[] fields = personClass2.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field.getName() + ", " + field.getType());
        }

        // ���������
        Annotation[] annotations = personClass3.getAnnotations();
        for (Annotation annotation : annotations) {
            if (annotation instanceof Author) {
                System.out.println("Yes");
            }
        }
    }
}
