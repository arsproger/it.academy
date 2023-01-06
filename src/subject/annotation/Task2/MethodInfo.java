package subject.annotation.Task2;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// Аннотирующие аннотации
@Target(ElementType.METHOD)  // @Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface MethodInfo {
    String author() default "None";
    int dateOfCreation() default 2022;
    String purpose();
}
