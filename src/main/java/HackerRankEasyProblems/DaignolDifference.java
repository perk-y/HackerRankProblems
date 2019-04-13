package HackerRankEasyProblems;

public class DaignolDifference {
    static int diagonalDifference(int[][] arr) {
        int  d1=0;
        int d2=0;
        for(int i=0;i<arr.length;i++)
            for(int j=0;j<arr[i].length;j++){
               if(i==j) d1+=arr[i][j];
               if ((i+j)==(arr.length-1)) d2+=arr[i][j];
            }
    return Math.abs(d1-d2);
    }

}
