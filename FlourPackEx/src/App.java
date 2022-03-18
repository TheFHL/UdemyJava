public class App {
    public static void main(String[] args) throws Exception {
        
        System.out.println(canPack(1, 0, 4));
        System.out.println(canPack(2, 2, 11));
        System.out.println(canPack(-2, 2, 11));
        System.out.println("-----------------------------------------");
        System.out.println(getLargestPrime(21));
        
    }

    public static int getLargestPrime(int number){

        if(number < 2){
            return -1;
        }

        for(int i = 2; i < number; i++){
            if(number % i == 0){
                number /=i;
                i--;
            }
        }
        return number;
    }

    public static boolean canPack(int bigCount, int smallCount, int goal){

        for(int i = 0; i <= bigCount; i++){
            for(int j = 0; j <= smallCount; j++){
                if((5*i)+j == goal){
                    return true;
                }
            }
        }

        return false;
    }
}
