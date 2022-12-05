import java.util.*;
public class KMP_Strings {

    public static void naive(String txt, String pat){
        int n=txt.length();
        int m=pat.length();
        boolean flag=false;
        for(int i=0;i<=(n-m);i++) {
            int j = 0;
            for (; j < m; j++) {
                if (txt.charAt(i + j) != pat.charAt(j)) {
                    break;
                }
            }
            if (j == m) {
                System.out.print("Pattern found at index " + i);
                flag = true;
            }
        }


    if(!flag){
        System.out.print("Not Found");
    }
        }

    public static void main(String[]args){
        String txt="CHITKARA_UNIVERSITY";
        String pat="UNI";
        naive(txt,pat);
    }
}


