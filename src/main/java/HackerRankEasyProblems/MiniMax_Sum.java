package HackerRankEasyProblems;

import java.util.Arrays;

public class MiniMax_Sum {
    static void miniMaxSum(int[] arr) {
        Arrays.sort(arr);
        long minsum=0;
                long maxsum=0;
        for(int i=1;i<arr.length-1;i++){
            maxsum+=arr[i];
            minsum+=arr[i];

        }
        minsum+=arr[0];
        maxsum+=arr[arr.length-1];
        System.out.println(minsum + " "+ maxsum);

    }
}
