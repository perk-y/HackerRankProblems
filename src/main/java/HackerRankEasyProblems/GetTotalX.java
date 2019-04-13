package HackerRankEasyProblems;

public class GetTotalX {
    static int getTotalX(int[] a, int[] b) {
        /*
         * Write your code here.
         */
      int max=0;
      int nums=0;
      for(int i=0;i<a.length;i++)
          if(max<a[i]) max=a[i];
          for(int j=0;j<b.length;j++)
              if(max<b[j]) max=b[j];

      for(int i=1;i<=max;i++){
          boolean flag = true;
          for(int j=0;j<a.length;j++)
              if( a[j]!= 0 && !(i%a[j]==0)) { flag=false; break;}
           for(int k=0;k<b.length;k++)
               if(!(b[k]%i==0)){ flag=false; break; }
           if(flag==true)  nums++;
      }
return nums;

    }

}
