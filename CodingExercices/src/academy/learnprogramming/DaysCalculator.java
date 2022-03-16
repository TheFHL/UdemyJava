package academy.learnprogramming;

public class DaysCalculator {
    
    public static void printYearsAndDays(long minutes){
        if(minutes < 0){
            System.out.println("Invalid Value");
        }

        long year = minutes / 60;
        long remainderMinutes = minutes % 60;

    }
}
