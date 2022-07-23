package text3;

public class ten {
    public static void main(String[] args) {
        ren r = new ren("牛逼","牛国");
        ren e = new ren("马牛逼","马国");
        ren w = new ren("菲菲","猪国");
        System.out.println(r.getInfo());
        System.out.println(w.getInfo());System.out.println(e.getInfo());

    }
}
class ren{
    private String name;
    private String country;

    public ren(String name,String country){
        this.name=name;
        this.country=country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    public String getInfo(){
        return "name="+name+",country="+country;
    }
}