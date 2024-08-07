public class ClusmysFact {
    public static int clumsy(int n){
        if(n==1){
            return 1;
        }
        clumsy(n-1);
        int ans=n*(n-1);
        return ans;

    }
    public static void main(String[] args) {
        int n=4;
        System.out.println(clumsy(n));;;
       

    }
}
