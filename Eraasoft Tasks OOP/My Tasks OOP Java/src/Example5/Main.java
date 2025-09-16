package Example5;

public class Main {
    static public void main(String args[]){
        Department department=new Department(1,"cs");
        Employee employee=new Employee(122,50000,"shahd","Rabea","Eid","+O","1556","Egypt",2004,department);
        System.out.println(employee);//as toString
    }
}
