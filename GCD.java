import java.util.*;
public class GCD {
    public static void main(String[] args){
        int a;
        int b;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        int min=(a<b)?a:b;
        int i=1,gcd=1;
        if(a%b==0){
            System.out.println(b);
        }
        else if(b%a==0){
            System.out.println(a);
        }
        else{
            while(i<min){
                if((a%i==0)&&(b%i==0)){
                    gcd=i;
                }
                i++;
            }

        }
        System.out.println(gcd);
    }
}
