package HackerRankEasyProblems;

public class Kangaroo {
    static String kangaroo(int x1, int v1, int x2, int v2) {
            if(x1>x2 && v1>v2 )
                return "NO";
            else if (x2>x1 && v2>v1)
                return "NO";
           else  if(x1==x2)
               return "YES";
            else  if ( v1!=v2 && (Math.abs(x1 - x2) % Math.abs(v2 - v1) )== 0)
                return "YES";

             else return "NO";


    }
}
