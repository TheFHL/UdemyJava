package academy.learnprogramming;

public class DurationString {

    private static final String INVALID_VALUE_MESSAGE = "Invalid value";

    public static String getDurationString(int mn, int sc){
        if(mn < 0 || (sc < 0 || sc > 59)){
            return INVALID_VALUE_MESSAGE;
        }

        int hr = mn/60;
        int remainingMn = mn % 60;

        String hrString = hr + "h";
        if(hr < 10){
            hrString = "0" + hrString;
        }

        String mnString = remainingMn + "m";
        if(remainingMn < 10){
            mnString = "0" + mnString;
        }

        String scString = sc + "s";
        if(sc < 10){
            scString = "0" + scString;
        }

        return hrString + " " + mnString + " " + scString + "";
    }

    public static String getDurationString(int sc){
        if(sc < 0){
            return INVALID_VALUE_MESSAGE;
        }

        int mn = sc/60;
        int remainingSc = sc % 60;
        return getDurationString(mn, remainingSc);
    }
}
