package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

//        long miles = SpeedConverter.toMilesPerHour(10.5);
//        System.out.println("Miles = " + miles);
//
//        SpeedConverter.printConversion(10.5);
//
//        MegaBytesConverter.printMegaBytesAndKiloBytes(2500);
//
//        System.out.println(BarkingDog.shouldWakeUp(true, -1));

//        int newScore = calculateScore("Sacha", 100);
//        System.out.println("new score is " + newScore);
//        calculateScore(75);

        MethOverloading.calcFeetAndInchesToCentimeters(6,0);
        MethOverloading.calcFeetAndInchesToCentimeters(157);

        System.out.println(DurationString.getDurationString(72,45));
        System.out.println(DurationString.getDurationString(5899));
        System.out.println(DurationString.getDurationString(-41));

        System.out.println(AreaCalculator.area(5.0));
        System.out.println(AreaCalculator.area(5.0, 4.0));

        EqualityPrinter.printEqual(5, 5, 5);

        System.out.println(PlayingCat.isCatPlaying(true, 39));
        System.out.println(PlayingCat.isCatPlaying(false, 39));
        System.out.println(PlayingCat.isCatPlaying(false, 28));
        System.out.println(PlayingCat.isCatPlaying(true, 26));



    }

    private static int calculateScore(String playerName, int score){
        System.out.println("Player " + playerName + " scored : " + score);
        return score*100;
    }

    private static int calculateScore(int score){
        System.out.println("Unnamed player scored : " + score);
        return score*100;
    }


}
