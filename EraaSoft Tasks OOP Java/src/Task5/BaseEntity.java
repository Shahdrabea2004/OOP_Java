package Task5;

public class BaseEntity{
    private int id;
    private String name;

    public BaseEntity(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public BaseEntity() {
    }

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


    public void print() {
        System.out.println( "BaseEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}');
    }
}
