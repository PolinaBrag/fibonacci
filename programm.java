package Fibonacci;
import java.util.Date;

public class programm {
    
    public static void main(String[] args) {
        
        for (int i = 5; i <= 55; i = i + 10) {
            Date startDate = new Date();
            fbLine.fb(i);
            Date endDate = new Date();
            long lineDuration = endDate.getTime() - startDate.getTime();

            Date startDate1 = new Date();
            fbRecursive.fb(i);
            Date endDate1 = new Date();
            long recursiveDuration = endDate1.getTime() - startDate1.getTime();
            System.out.printf("i: %s, line duration: %s, recursive duration: %s%n", i, lineDuration, recursiveDuration);
        }
    }
           
}