public class App {
    public static void main(String[] args) throws Exception {
        
        int switchValue = 1;

        switch(switchValue){
            case 1:
                System.out.println("Value was 1");
                break;

            case 2:
                System.out.println("Value was 2");
                break;
            
            default:
                System.out.println("Was not 1 or 2");
        }

        char switchChar = 'A';

        switch(switchChar){
            case 'A':
                System.out.println("Value is A");
                break;
            case 'B':
                System.out.println("Value is B");
                break;
            case 'C':
                System.out.println("Value is C");
                break;
            case 'D':
                System.out.println("Value is D");
                break;
            default:
                System.out.println("Not found");
                break;
        }

        String month = "january";

        switch(month.toLowerCase()){
            case "january":
                System.out.println("jan");
                break;
            case "february":
                System.out.println("feb");
                break;
            default:
                System.out.println("not found");
                break;
        }
    }
}
