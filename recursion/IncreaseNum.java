public class IncreaseNum {
    public static void increase(int n){
        //define the base case
        if(n==1){
            System.out.println(n);
            return;
        }
        increase(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        int n=6;
        increase(n);
    }
}
