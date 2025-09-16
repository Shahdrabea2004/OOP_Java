package Examples7;

import java.util.*;

public class Main extends ArrayList {
    static Scanner input = new Scanner(System.in);

    static public void Example1() {
        int n = input.nextInt();
        ArrayList<Integer> Distinct_list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int x = input.nextInt();
            if (!Distinct_list.contains(x)) Distinct_list.add(x);
        }
        System.out.println(Distinct_list);
    }

    static public void Exaample2() {
        //int n= input.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("1.Add Element");
        System.out.println("2.Remove Element");
        System.out.println("3.Print Elements");
        System.out.println("4.Exit");
        while (true) {
            int x = input.nextInt();
            if (x == 1) {
                int a = input.nextInt();
                list.add(a);
            } else if (x == 2) {
                int a = input.nextInt();
                list.remove((Integer) a);
            } else if (x == 3) {
                System.out.println(list);
            } else {
                break;
            }

        }
    }

    public Main(ArrayList<Integer> list) {
        super(list);
        //or this.addAll(list);
    }

    public static void main(String[] args) {

////        int n=input.nextInt();
//        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(1,2,3,4,5));
////        for(int i=0;i<n;i++){
////          int x= input.nextInt();
////          list.add(x);
////        }
//
//
//        int y=95;
//        list.add(3,y);
//
//        ArrayList<Integer> list2=new ArrayList<Integer>(Arrays.asList(10,20,30,40));
//        list.addAll(list2);
//
//        list.addAll(Arrays.asList(66,80,45,21));
//
//        list.addAll(5,Arrays.asList(180,963));
//
////        for(Integer num:list){
////            System.out.print(num+" ");
////        }
//
//        System.out.println();
//
////        5
////        1 2 3 4 5
////        1 2 3 95 4 180 963 5 10 20 30 40 66 80 45 21
//
//        list2=list;
//        list2=(ArrayList) list.clone();
//        System.out.println(list2);
//
//        List<Integer>list3=new ArrayList<>(list2);
////        System.out.println(list2);
//
//        list3.remove(2);
//        list3.remove(Integer.valueOf(180));
//        list3.remove((new Integer(10)));
//        list3.remove((Integer) 66);
//
//        list3.removeAll(Arrays.asList(5));
//        list3.removeAll(Arrays.asList(6,20));
//        list3.removeAll(Collections.singleton(21));
//        list2.removeAll(list3);
//        System.out.println(list3);
//        System.out.println(list2);
//
//
//        Main arr=new Main(list);
//        arr.removeRange(0,5);
//        System.out.println(arr);
//
//        list2.removeIf(num->num%2==0);
//        System.out.println(list2);
//
//        ArrayList listDiff =new ArrayList(Arrays.asList("shahd",21,true,"*",50000000000.5,"ohhhhhh"));
//        System.out.println(listDiff);
//
//        list.set(0,89654);
//        System.out.println(list.get(0));
//
//        System.out.println(list.contains(89654));
//
//        list.retainAll(Arrays.asList(10,20,50,2,5));
//        System.out.println(list);
//
//        ArrayList <Integer> list4=new ArrayList(list.subList(0,3));
//        System.out.println(list4);
//
//        list.clear();
//        System.out.println(list.isEmpty());
//
//        list.ensureCapacity(150);
//
//        list.trimToSize();
//
//        list4.forEach(el-> System.out.print(el+"-"));


        //Example1
        //Example1();

        //Example2
        Exaample2();


    }
}
