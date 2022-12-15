import java.util.*;
public class Maxelem {
//    static void max_ele(int x[]) {
//        int max;
//        max = x[0];
//        for (int i = 0; i < x.length; i++) {
//            if (max < x[i]) {
//                max = x[i];
//            }
//        }
        static int[] sort_ele ( int x[]){
            int temp;
            for (int i = 0; i < x.length; i++) {
                for (int j = 1; j < x.length - i - 1; j++) {
                    if (x[j] > x[j + 1]) {
                        temp = x[j + 1];
                        x[j + 1] = x[j];
                        x[j] = temp;

                    }
                }
            }
            return x;
//            System.out.println("Max element= " + max);

        }

        public static void main (String[]args){
            int a[] = {11, 5, 8, 3};
            int j[] = sort_ele(a);
            for(int k=0;k<j.length;k++){
                System.out.println(j[k]);
            }

//            max_ele(a);
        }

    }
//}
