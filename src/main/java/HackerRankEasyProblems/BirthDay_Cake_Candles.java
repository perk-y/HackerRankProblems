package HackerRankEasyProblems;

import java.util.Arrays;

public class BirthDay_Cake_Candles {
    static int birthdayCakeCandles(int[] ar) {
        Arrays.sort(ar);
        int max=ar[ar.length-1];
        int blownCandles=0;
        int i=ar.length-1;
        while(i>=0 && ar[i]==max   ){
            blownCandles++;
            i--;

        }
return  blownCandles  ;
    }

    }

