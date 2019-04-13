package HackerRankEasyProblems;

public class TimeConversion {
    static String timeConversion(String s) {
        String result ="";
        String[] parameters =s.split(":");
        String meridian = parameters[2].substring(2,4);
        int hours = Integer.parseInt(parameters[0]);
        int minutes =Integer.parseInt(parameters[1]);
        int seconds = Integer.parseInt(parameters[2].substring(0,2));
        if(meridian.equals("PM")){
            if(hours<12) hours=hours+12;
            if(hours==24) hours=0;


        }
        if(meridian.equals("AM"))
            if(hours==12) hours=0;
        if(hours==0) parameters[0]="00";
        if(minutes==0) parameters[1]="00";
        if(seconds==0) parameters[2]="00";

        if( numberofdigits(hours)==1) parameters[0]=  "0"+ hours;
        else if(hours!=0) parameters[0]=""+hours;
        if( numberofdigits(minutes)==1) parameters[1]="0"+ minutes;
        else if(minutes!=0) parameters[1]=""+minutes;
        if( numberofdigits(seconds)==1) parameters[2]=  "0"+ seconds;
        else  if(seconds!=0) parameters[2]=""+seconds;

        result=parameters[0]+":"+ parameters[1]+ ":"+ parameters[2];

        return result;
    }


     static int  numberofdigits(int num){
        int digits=0;
        while(num>0){
            num=num/10;
            digits++;
        }
return digits;
    }
}
