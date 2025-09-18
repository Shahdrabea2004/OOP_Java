package Task8.model;

public class Posts {
    private int id;
    private String image;

    private String text;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Posts{" +
                "id=" + id +
                ", image='" + image + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
