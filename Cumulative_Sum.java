import java.util.*;
public class Cumulative_Sum {
    
        int[] getCumulativeSum (int[] arr) {
            int prefixSum[] = new int[arr.length];
            for(int i = 0; i < arr.length; i++) {
                int prefix = 0;
                for(int j = 0; j <= i; j++) {
                    prefix += arr[j];
                }
                prefixSum[i] = prefix;
            }
            return prefixSum;
        }
    }
}
