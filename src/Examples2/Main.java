package Examples2;

public class Main {
    static void fun(Test obj){
        obj.number++;
    }
    static int fun(int a,int b){
        int ans=a+b;
        return ans;
    }
    public static void main(String []args){
       Test test = new Test();
       test.number=199;
       fun(test);
        System.out.println(test.number);


        int a=5,b=5;
        System.out.println(fun(a,b));

    }

}
