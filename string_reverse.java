import java.util.*;

public class string_reverse {
    public static void main(String[]args){
        String s;
        String s1="";
        String s2="";
        Scanner sc=new Scanner(System.in);
        s=sc.nextLine();
        for(int i=s.length()/2-1;i>=0;i--){
//            System.out.print(s.[i]);
            s1=s1+s.charAt(i);
        }
        for(int i=s.length()-1;i>(s.length()/2)-1;i--){
            s2=s2+s.charAt(i);
        }
        System.out.print(String.join("",s1,s2));
    }

}
