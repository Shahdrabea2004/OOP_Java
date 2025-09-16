package Examples2;

public class Main {
    static void fun(Test obj){
        obj.number++;
    }
    static int fun(int a,int b){
        int ans=a+b;
        return ans;
    }
    public static void main(String []args){/*
       Test test = new Test();
       test.number=199;
       fun(test);
        System.out.println(test.number);


        int a=5,b=5;
        System.out.println(fun(a,b));
*/

        Math n1=new Math(1,2);
        Math n2=new Math(1,20);
        Math ans=n1.add(n2);
        System.out.println(ans.val1+" "+ ans.val2);
        Math n3=new Math();
        Math ans2=n3.add(n1,n2);
        System.out.println(ans2.val1);

        System.out.println(n1.isEqual(n2));


    }

}
