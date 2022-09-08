package Java基础.junit反射动态代理注解.注解;

/**
 * 学会自定义注解
 *
 */
@MyBook(name = "《精通javase》",authors = {"爷爷","啵啵"},price = 199.3)
//@Book(value = "/dsds")
@Book("/sdsd")
public class AnnotationDemo1 {
    @MyBook(name = "《精通javase》",authors = {"爷爷","啵啵"},price = 199.3)
    private AnnotationDemo1(){}
    @MyBook(name = "《精通javase》",authors = {"爷爷","啵啵"},price = 199.3)
    public static void main(String []args){
        @MyBook(name = "《精通javase》",authors = {"爷爷","啵啵"},price = 199.3)
        int age =21;
    }
}
