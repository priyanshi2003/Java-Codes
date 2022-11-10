import java.util.*;
public class prime_factorisation {
    public static void main(String[]args){
        int num;
        Scanner sc= new Scanner(System.in);
        num=sc.nextInt();

        for(int i=2;i<=num;i++){
            while(num%i==0){
                System.out.println(i);
                num=num/i;
            }
        }
    }
}
