public class FibonacciSeries {
    public static void printFibo(int n){
        int a=0;
        int b=1;
        int i=1;
        while (i<=n) {
            int c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
            i++;
        }

        
    }
    public static void main(String[] args) {
        int n=8;
        printFibo(n);
    }
}
