package Java基础.test8设计模式链表jdk8表达式;

public class test3 {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public test3(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "test3{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public test3() {
        super();
    }
}
