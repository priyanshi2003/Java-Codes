import java.util.*;
public class smith_number {

        public static int sumDigit(int n){
            int sum=0;
            while(n>0){
                int rem=n%10;
                sum=sum+rem;
                n=n/10;
            }
            return sum;
        }
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int sum1=0;
        int num=n;
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                if (i >= 10) {
                    sum1+=sumDigit(i);
                } else {
                    sum1=sum1+i;
                }
                n=n/i;
            }
        }

        if(sum1==sumDigit(num)){
            System.out.println("It is a smith number");
        }
        else{
            System.out.println("Not a smith number");
        }
    }
}
