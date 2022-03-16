public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("The sum of the digits in number 125 is " + sumDigits(125));
        System.out.println("The sum of the digits in number -125 is " + sumDigits(-125));
        System.out.println("The sum of the digits in number 4 is " + sumDigits(4));
        System.out.println("The sum of the digits in number 32123 is " + sumDigits(32123));

        System.out.println("------------------------------------------");

        System.out.println("is Palindrome ? " + isPalindrome(1221));
        
    }

    public static boolean isPalindrome(int number){

        int reverse = 0;
        int lastDigit;
        int num = number;

        while(num!=0){
            lastDigit = 0;
            lastDigit = num % 10;
            reverse *= 10;
            reverse += lastDigit;
            num /= 10;
        }

        if(reverse == number){
            return true;
        } else {
            return false;
        }
    }

    private static int sumDigits(int number){
        if(number < 10){
            return -1;
        }

        int sum = 0;

        // 125 -> 125/10 = 12 -> 12*10 = 120 -> 125-120 = 5
        while(number > 0){
            // extract the least-significant digit
            int digit = number % 10;
            sum += digit;

            // drop the least-significant digit
            number /= 10; // samas as number = number / 10;
        }

        return sum;
    }
}
