package Examples3;

public class Main {
    public static void main(String []args) {
      Developer developer=new Developer("s","@","010",20,"hh");

      developer.setName("shahd");
      System.out.println(developer.getName());
      developer.name="rr" ;
      System.out.println(developer.toString());

    }
}

