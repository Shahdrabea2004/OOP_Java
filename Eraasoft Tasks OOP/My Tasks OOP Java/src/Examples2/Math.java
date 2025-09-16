package Examples2;

public class Math {
    int val1,val2;

    public Math() {
    }
    public Math(int val1, int val2) {
        this.val1 = val1;
        this.val2 = val2;
    }

     public Math add(Math n2){
        Math ans=new Math();
        ans.val1=this.val1+n2.val1;
        ans.val2=this.val2+n2.val2;
        return ans;
    }
    public Math add(Math n1,Math n2){
        Math ans=new Math();
        ans.val1= n1.val1+n2.val1;
        return ans;
    }

    boolean isEqual(Math n1){
        return n1.val1==this.val1;
    }

}
