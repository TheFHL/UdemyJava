package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        // Create a double variable with value of 20.00
        // Create a second double variable with the value of 80.00
        // Add both numbers together and multiply by 100.00
        // Use the remainder operator to figure out what the remainder from the result % 40.00
        // Create a boolean = true if the remainder is 0, else = false
        // Write if-then that display "Got some remainder" if boolean = true

        double firstDouble = 20.00;
        double secondDouble = 80.00;

        double result = (firstDouble + secondDouble) * 100.00;
        System.out.println(result);

        double modResult = result % 40.00;
        System.out.println(modResult);

        boolean isNoRemainder = (modResult == 0) ? true : false;
        System.out.println("isNoRemainder = " + isNoRemainder);

        if(!isNoRemainder){
            System.out.println("got some remainder");
        }

    }
}
