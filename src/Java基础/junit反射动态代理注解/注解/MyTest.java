package Java基础.junit反射动态代理注解.注解;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD,ElementType.FIELD})  //元注解1方法 ，2成员变量
@Retention(RetentionPolicy.RUNTIME)//一直活着
public @interface MyTest {
}
