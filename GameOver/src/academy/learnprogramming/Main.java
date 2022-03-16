package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        int highScore = calculateScore(true, 800,5, 100);
        System.out.println("The highscore is " + highScore);

        highScore = calculateScore(true, 1000,8, 200);
        System.out.println("The 2nd highscore is " + highScore);

        int highScorePosition = calculatedHighScorePosition(1000);
        displayHighScorePosition("Sacha", highScorePosition);

        highScorePosition = calculatedHighScorePosition(500);
        displayHighScorePosition("Tim", highScorePosition);

        highScorePosition = calculatedHighScorePosition(100);
        displayHighScorePosition("Ralph", highScorePosition);

        highScorePosition = calculatedHighScorePosition(50);
        displayHighScorePosition("Steve", highScorePosition);

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){

        if(gameOver){
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
//            System.out.println("Your final score was " + finalScore);
            return finalScore;
        }
        return -1;

    }

    public static void displayHighScorePosition(String playerName, int highScorePosition){
        System.out.println(playerName + " managed to get into position : " + highScorePosition
                + " On the highscore table");
    }

    public static int calculatedHighScorePosition(int playerScore){
//        if(playerScore >= 1000){
//            return 1;
//        } else if(playerScore >= 500){
//            return 2;
//        } else if(playerScore >= 100){
//            return 3;
//        }
//        return 4;

        int position = 4;

        if(playerScore >= 1000){
            position = 1;
            return position;
        } else if(playerScore >= 500){
            position = 2;
            return position;
        } else if(playerScore >= 100) {
            position = 3;
            return position;
        }
        return position;
    }
}
