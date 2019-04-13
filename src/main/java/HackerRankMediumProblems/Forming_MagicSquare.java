package HackerRankMediumProblems;

import java.util.Arrays;
import java.util.Scanner;

public class Forming_MagicSquare {
    static int formingMagicSquare(int[][] s) {
        //Doesnt provide minimum Cost .
        int cost =0;
        int[][] updatedsquare=new int[s.length+2][s.length+2];
        for(int i=0;i<updatedsquare.length;i++){
            for(int j=0;j<updatedsquare[i].length;j++){
                if((i!=0 && i-1<s.length   ) &&(  j!=0 && j-1 <s.length))  updatedsquare[i][j]=s[i-1][j-1];
                else updatedsquare[i][j]=0;
            }
        }
        int maxSum =0;
        //Initializing sums of rows
        int r=0,l=0;
        for(int i=1;i<updatedsquare.length-1;i++){

            for(int j=1;j<updatedsquare[i].length-1;j++){
                updatedsquare[i][4]+=updatedsquare[i][j];
                if(i==j) r+=updatedsquare[i][j];
                if(i+j==updatedsquare.length-1) l+=updatedsquare[i][j];
            }
            if(updatedsquare[i][4]>maxSum) maxSum=updatedsquare[i][4];

        }
        updatedsquare[4][4]=r;// right Diagnol
        updatedsquare[4][0]=l;//Left Diagnol

        //Initializing Sum of columns
        for(int i=1;i<updatedsquare.length-1;i++){
            for(int j=1;j<updatedsquare.length-1;j++){
                updatedsquare[4][i]+=updatedsquare[j][i];

            }
            if(updatedsquare[4][i]>maxSum) maxSum=updatedsquare[4][i];
        }
        if(r>maxSum) maxSum=r;
        if(l>maxSum) maxSum=l;
//        System.out.println("Maximum Sum " + maxSum);


        for(int i=1;i<updatedsquare.length-1;i++){
            for(int j=1;j<updatedsquare[i].length-1;j++){
                if(updatedsquare[4][j]!=maxSum && updatedsquare[i][4]!=maxSum){
                    int diff=0;
                    if(updatedsquare[4][j]==updatedsquare[i][4]) diff=maxSum-updatedsquare[4][j];
                    else  diff = updatedsquare[4][j]>updatedsquare[i][4]? maxSum-updatedsquare[4][j]:maxSum-updatedsquare[i][4];
                    updatedsquare[i][j]+= diff;
                    cost+=diff;
                    updatedsquare[i][4]+=diff;
                    updatedsquare[4][j]+=diff;

                }
            }
        }

//        System.out.println("Cost " + cost);

//        for(int i=1;i<updatedsquare.length-1;i++){
//            for(int j=1;j<updatedsquare[i].length-1;j++){
//                System.out.print(updatedsquare[i][j]);
//            }
//            System.out.println();
//
//        }
        return cost;

    }
    public static void main(String[] args){
        int[][] s = {
                {4,8,2},
                {4,5,7},
                {6,1 ,6}
        };

        int result = Forming_MagicSquare.formingMagicSquare(s);
        System.out.println(result);
    }
}
