package HackerRankEasyProblems;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FizzBuzz {
    public static void main(String args[] ) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       int no_of_testCases=  Integer.parseInt(br.readLine());
        System.out.println(no_of_testCases);
        StringBuilder sb = new StringBuilder(br.readLine());
        String[] cases =  sb.toString().split(" ");
        for(int i=0;i<no_of_testCases;i++){
            for(int j=1;j<=Integer.valueOf(cases[i]);j++){
                if((j%3==0) && (j%5 ==0)) System.out.println("FizzBuzz");
               else  if(j%3==0) System.out.println("Fizz");
               else  if(j%5==0) System.out.println("Buzz");
                else System.out.println(j);

            }

        }
    }
}
