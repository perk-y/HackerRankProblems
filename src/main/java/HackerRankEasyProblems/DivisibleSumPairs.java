package HackerRankEasyProblems;

public class DivisibleSumPairs {

    static int divisibleSumPairs(int n, int k, int[] ar) {
        int ways=0;
        for(int i=0;i<ar.length;i++){
            int sum=0;
            for(int j=i+1;j<ar.length;j++){
                sum =ar[i]+ar[j];
                if(sum%k==0) ways++;
            }
        }
return ways;
    }
}
