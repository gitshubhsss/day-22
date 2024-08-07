public class Factorial {
    public static int fact(int n){
        if(n==1){
            return 1;
        }
        int factorial=n*fact(n-1);
        return factorial;
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(fact(n));
    }
}
