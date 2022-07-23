package jdbc;

public class Account {
    private int id;
    private String name;
    private int jj;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getJj() {
        return jj;
    }

    public void setJj(int jj) {
        this.jj = jj;

    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", jj=" + jj +
                '}';
    }
}
