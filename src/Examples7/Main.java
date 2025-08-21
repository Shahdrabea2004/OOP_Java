package Examples7;
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++){
          int x= input.nextInt();
          list.add(x);
        }


        int y=95;
        list.add(3,y);

        ArrayList<Integer> list2=new ArrayList<Integer>(Arrays.asList(10,20,30,40));
        list.addAll(list2);

        list.addAll(Arrays.asList(66,80,45,21));

        list.addAll(5,Arrays.asList(180,963));

        for(Integer num:list){
            System.out.print(num+" ");
        }

        System.out.println();

//        5
//        1 2 3 4 5
//        1 2 3 95 4 180 963 5 10 20 30 40 66 80 45 21

        list2=list;
        list2=(ArrayList) list.clone();
        System.out.println(list2);

        ArrayList<Integer>list3=new ArrayList<>(list2);
        System.out.println(list2);



    }
}
