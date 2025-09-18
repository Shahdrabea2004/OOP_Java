package Task5;

public class ShareData extends BaseEntity{
    private String phone;

    public ShareData(int id, String name, String phone) {
        super(id, name);
        this.phone = phone;
    }

    public ShareData() {
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("{ ShareData: "+"Phone: "+phone+" }");
    }
}
