import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        
        int counter = 0;
        int sum = 0;

        while(counter < 10){
            int order = counter+1;
            System.out.println("Enter number #" + order +":");

            boolean isAnInt = scanner.hasNextInt();

            if(isAnInt){
                int number = scanner.nextInt();
                // counter++;
                // sum +=number;

                // possible de vérifier si order = number

                if(number == order){
                    counter++;
                    sum +=number;
                } else{
                    System.out.println("invalid number");
                }

            } else {
                System.out.println("Invalid Number");
            }

            scanner.nextLine(); // handle end of line (Enter key)
        }

        System.out.println("sum = " +sum);
        scanner.close();
    }
}
