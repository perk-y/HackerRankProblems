package HackerRankEasyProblems;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BirthdayChoclate {
    static int birthday(List<Integer> s, int d, int m) {
        int ways=0;
        for(int i=0;i<s.size()-(m-1);i++){
            int j=i;
            int sum =0;
            while( j< s.size() && j<i+m){
                sum+=s.get(j);
                j++;
            }
            if(sum == d)  ways++;
        }
return ways;
    }
    Scanner input = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
Scanner scan = new Scanner(System.in);
int n = scan.nextInt();


        List<Integer> s = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int sItem =scan.nextInt();
            s.add(sItem);
        }


        int d = scan.nextInt();

        int m = scan.nextInt();

        int result = birthday(s, d, m);

        System.out.println(result);

    }
}


