package Java基础.test9集合框架和lambda表达式;

public class Cat {
    private String name;
    private int age;
    private int id;

    public Cat(String name, int age, int id) {
        super();
        this.name=name;
        this.age=age;
        this.id=id;
    }

    public Cat() {
        super();
    }

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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                '}';
    }

}
