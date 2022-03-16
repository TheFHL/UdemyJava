package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        // byte
        // short
        // int
        // long
        // float
        // double
        // char
        // boolean

        String myString = "This is a string";
        System.out.println("myString is equal to " + myString);
        myString = myString + ", and this is more";
        System.out.println("myString is equal to " + myString);
        myString = myString + " \u00A9 2022";
        System.out.println("myString is equal to " + myString);

        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println(numberString);
        String lastString = "50";
        int myInt = 10;
        lastString = lastString + myInt;
        System.out.println("LastString is equal to " + lastString);

        // if-then statement

        boolean isAlien = false;
        if (!isAlien) {
            System.out.println("It is not an alien!");
        }

        int topScore = 80;
        if (topScore <= 100){
            System.out.println("You got the high score !");
        }

        int secondTopScore = 60;
        if (topScore > secondTopScore && topScore < 100) {
            System.out.println("Greater than second top score and less than 100");
        }

        if (topScore > 90 || secondTopScore <= 90) {
            System.out.println("either or both of the conditions are true");
        }

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("this is -no more- an error");
        }

        boolean isCar = false;
        if (isCar){
            System.out.println("this is not supposed to happen");
        }

        boolean wasCar = isCar ? true : false;
        if (wasCar){
            System.out.println("wasCar is true");
        }

    }
}
