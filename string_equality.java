import java.util.*;

public class string_equality {
    public static void main(String[]args){
        String s1;
        String s2;
        boolean flag=false;
        Scanner sc = new Scanner(System.in);
        s1=sc.nextLine();
        s2=sc.nextLine();
        if(s1.length()!=s2.length()){
            System.out.print("Not Equal");
        }
        //dont use inbuilt equals function in this string case as it can ive wrong answer do it char by char
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)==s2.charAt(i)){
                flag=true;
            }
            else{
                flag=false;
            }
        }
        if(flag==true){
            System.out.print("Strings are equal");
        }
        else{
            System.out.print("Strings are not equal");
        }
    }
}
