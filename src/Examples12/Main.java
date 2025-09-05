package Examples12;

public enum Main {
    ONE,TWO;
    public static void main(String []Shahd){
        try {
            int arr[] = new int[]{1, 2, 3};
            System.out.println(arr[5]);
        }catch (java.lang.ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }

        try {
            int arr[] = null;
            System.out.println(arr[5]);
        }catch (NullPointerException e){
            System.out.println(e);
        }

        try {
            var val2 = Integer.parseInt("89");
            System.out.println(val2);
            var val = Integer.parseInt("String89");
            System.out.println(val+" "+val2);
        }catch (NumberFormatException e){
            System.out.println(e);
        }

        try {
            int ans = 5 / 0;
            System.out.println(ans);
        }catch (ArithmeticException e){
            System.out.println(e);
        }

        try {
            int arr[] = new int[5];
            arr[6]=55;
            int x=7/0;
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }catch (ArithmeticException e){
            System.out.println(e);
        }

        try {
            int arr[] = new int[5];
            arr[6]=7/0;//compiler walk from right to left
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }catch (ArithmeticException e){
            System.out.println(e);
        }

        try {
            int arr[] = new int[5];
            arr[6]=7/0;//compiler walk from right to left
        }catch (ArrayIndexOutOfBoundsException |ArithmeticException e){
            System.out.println(e);
        }

        try {
            int arr[] = new int[]{1, 2, 3};
            System.out.println(arr[5]);
        }catch (Exception e){
            System.out.println(e);
        }

        System.out.println("shahd");

    }
}
