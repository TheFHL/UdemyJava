import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage(){
        
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int average = 0;
        

        while(true){
            
            System.out.println("Enter number: ");
            boolean isAnInt = scanner.hasNextInt();

            if(isAnInt){

                int number = scanner.nextInt();
                sum += number;
                average++;

            } else{
                break;
            }

        }

        System.out.println("SUM = "+ sum + " AVG = " + Math.round((double) sum/average));
        scanner.close();
        
    }
}
