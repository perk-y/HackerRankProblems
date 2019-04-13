package HackerRankEasyProblems;

import java.util.ArrayList;
import java.util.List;

public class Compare_The_Triplets {
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> scores = new ArrayList<>(2);
        scores.add(0);
        scores.add(0);
        for(int i=0;i<3;i++){
            if(a.get(i)>b.get(i)) scores.set(0,scores.get(0)+1 );
            else if(a.get(i)<b.get(i)) scores.set(1,scores.get(1)+1);

        }
return scores;
    }
   public static void callToMethod(){
       List<Integer> alice = new ArrayList<>();
       List<Integer> bob = new ArrayList<>();
       alice.add(5);
       alice.add(6);
       alice.add(7);
       bob.add(3);
       bob.add(6);
       bob.add(10);
       System.out.println(Compare_The_Triplets.compareTriplets(alice,bob));


    }
}
