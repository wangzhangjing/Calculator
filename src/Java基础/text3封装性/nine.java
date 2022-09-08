package Java基础.text3封装性;

public class nine {
    public static void main(String[] args) {
        Hero hero = new Hero("刘备",123);
        Weapon weapon = new Weapon("闪光剑",133);

        //把两个对象关联
        hero.setWeapon(weapon);
        weapon.setHero(hero);
        //通过英雄来获取它的信息
        String name=hero.getName();
        int age=hero.getAge();

        Weapon weapon1 = hero.getWeapon();
        System.out.println("我叫"+name+"我"+age+"岁，我的武器是"+weapon1.getWname()+",排行"+weapon1.getGr()+"级");
    }
}
//英雄
class Hero{
    private String name;
    private int age;
    private Weapon weapon;

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Hero(){}
public Hero(String name,int age){
    this.name=name;
    this.age=age;
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
}
//兵器类
class Weapon{
    private String wname;
    private int gr;
    private Hero hero;

    public Hero getHero() {
        return hero;
    }

    public void setHero(Hero hero) {
        this.hero = hero;
    }

    public Weapon(){}
public Weapon(String wname,int gr){
    this.wname=wname;
    this.gr=gr;
}
    public String getWname() {
        return wname;
    }

    public void setWname(String wname) {
        this.wname = wname;
    }

    public int getGr() {
        return gr;
    }

    public void setGr(int gr) {
        this.gr = gr;
    }
}