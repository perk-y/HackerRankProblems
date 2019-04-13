package HackerRankEasyProblems;

public class BreakingRecord {

    static int[] breakingRecords(int[] scores) {
        int[] maxmin=new int[2];
        maxmin[0]=0;
        maxmin[1] =0;
        int max =scores[0];
        int min =scores[0];
          for(int i=1;i<scores.length;i++){
              if(scores[i]>max){
                  maxmin[0]++;
                  max=scores[i];
              }
              if(scores[i]<min) {
                  maxmin[1]++;
                  min=scores[i];
              }

          }
    return maxmin;
    }
}
