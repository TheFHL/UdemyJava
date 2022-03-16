public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        System.out.println(isLeapYear(2017));
        System.out.println(getDaysInMonth(1, 2020));
        System.out.println(getDaysInMonth(2, 2020));
        System.out.println(getDaysInMonth(2, 2018));
    }

    public static int getDaysInMonth(int month, int year){

        if((month < 1 || month > 12) || (year < 1 || year > 9999)){
            return -1;
        }

        boolean checkYear = isLeapYear(year);

        if(checkYear && month == 2){
            return 29;
        } else if(!checkYear && month == 2){
            return 28;
        } else if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12){
            return 31;
        } else{
            return 30;
        }
    }

    public static boolean isLeapYear(int year){

        if(year < 1 || year > 9999){
            return false;
        } else {
            return ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
        }

    }

    public static void printNumberInWord(int numb){

        switch(numb){
            case 0:
                System.out.println("ZERO");
                break;
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            case 5:
                System.out.println("FIVE");
                break;
            case 6:
                System.out.println("SIX");
                break;
            case 7:
                System.out.println("SEVEN");
                break;
            case 8:
                System.out.println("EIGHT");
                break;
            case 9:
                System.out.println("NINE");
                break;
            default:
                System.out.println("OTHER");
                break;
        }

    }
}
