import java.util.*;
public class binarytodecimal {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String s= sc.nextLine();
        //binary to decimal
        int decimal=Integer.parseInt(s, 2);
        System.out.println(decimal);

        //decimal to binary
        int x=sc.nextInt();
        String rsult=Integer.toBinaryString(x);
        System.out.println(rsult);
    }
}
