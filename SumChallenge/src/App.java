public class App {
    public static void main(String[] args) throws Exception {
        
        int count = 0;
        int sum = 0;

        for(int i=1; i<=1000; i++){
            if((i % 3 == 0) && (i % 5 == 0)){
                count++;
                System.out.println("Found Number : " + i + " // Number of loop " + count);
                sum +=i;
                if(count == 5){
                    System.out.println("End of loop");
                    break;
                }
            }
        }

        System.out.println("Sum = " + sum);

        System.out.println("****************************************");

        System.out.println(sumOdd(1,100));
    }

    public static boolean isOdd(int number){
        return number > 0 && number % 2 != 0;

    }

    public static int sumOdd(int start, int end){

        int sum = 0;
        if((start<0 || end<1) || start>end){
            return -1;
        }
        for(int i=start; i<=end; i++){
           if(isOdd(i)){
               sum += i;
           } 
        }
        return sum;
    }
}