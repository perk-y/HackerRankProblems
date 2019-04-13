package HackerRankEasyProblems;

public class GradingStudents {
    static int[] gradingStudents(int[] grades) {
        /*
         * Write your code here.
         */
        for(int i=0;i<grades.length;i++){
            int diff=0;
            if(grades[i]>=38) {
                diff =grades[i]%5;
                diff=5-diff;
                if(diff<3) grades[i]+=diff;
            }

        }
return grades;
    }
}
