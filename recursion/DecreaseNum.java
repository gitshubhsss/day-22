public class DecreaseNum {
    static void decrease(int n) {

        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        decrease(n-1);
    }

    public static void main(String[] args) {
        int n = 5;
        decrease(n);
    }
}