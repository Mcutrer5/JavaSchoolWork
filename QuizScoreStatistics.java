import java.util.*;
@SuppressWarnings("unchecked")
public class QuizScoreStatistics {
    public static void main (String args[]) {
        // Write your code here
        Scanner input = new Scanner(System.in);
        int score = 0, hiScore = 0, loScore = 0, prevHiScore = 0, prevLoScore = 10, average = 0;
        final int QUIT = 99;
        Vector <Integer> scoreList = new Vector();

        System.out.println("Score input: Type 99 to quit.");

        do {
            System.out.print("Enter a score >> ");
            score = input.nextInt();


            if ((score >= 0 & score <= 10) | score == QUIT) {
                if (score != QUIT) {
                    scoreList.add(score);

                    if (score > prevHiScore) {
                        hiScore = score;
                    }
                    
                
                        if (score < prevLoScore) {
                            loScore = score;
                        } 
                    prevLoScore = score;
                    prevHiScore = score;  

                    
                } else {
                    System.out.print('\f');
                    System.out.println("Quitting...");
                    System.out.print('\f');
                }
            } else {
                System.out.println("Score must be between 10 and 0");
            }
        } while (score != QUIT);

        int sum = 0;
        double element = 0;

        for(int i=0; i<=scoreList.size()-1; i++) {
            element = scoreList.get(i);
            sum += scoreList.get(i);       
        }

        //average=sum/scoreList.size();
        element = scoreList.size();
        Double avg = Double.valueOf(sum / element);

        System.out.println("Number of scores: " + scoreList.size());
        System.out.println("hi score: " + hiScore);
        System.out.println("lo score: " + loScore);
        System.out.println(" Average: " + avg);
    }
}


