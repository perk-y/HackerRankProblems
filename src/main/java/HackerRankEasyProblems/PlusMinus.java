package HackerRankEasyProblems;

public class PlusMinus {
    static void plusMinus(int[] arr) {
        float negative=0,positive=0,zero=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0) negative++;
            else if (arr[i]>0) positive++;
            else zero++;

        }
 String format = "%."+ 6 +"f";
        float p= positive/arr.length;
        float n = negative/arr.length;
        float z= zero/arr.length;

        System.out.format(format, p);
        System.out.println();
        System.out.format(format, n);
        System.out.println();
        System.out.format(format, z);


    }

}

