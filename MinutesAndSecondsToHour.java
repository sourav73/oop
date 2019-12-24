import java.util.Scanner;

public class MinutesAndSecondsToHour {
    public static String getDurationString(int minutes,int seconds){
        int hour=0;
        if(minutes>=0 && (seconds>=0 && seconds<=59)) {
            hour+=minutes/60;
            int remainingMinutes=minutes%60;
            String hourString=hour+"h";
            if(hour<10)
                hourString="0"+hourString;
            String minuteString=remainingMinutes+"m";
            if(remainingMinutes<10)
                minuteString="0"+minuteString;
            String secondString=seconds+"s";
            if(seconds<10)
                secondString="0"+secondString;
            /*
            System.out.println(minutes+" minutes and "+seconds+" seconds = "+hour+"h "+remainingMinutes+"m "+
                    seconds+"s");
            System.out.printf("%d minutes and %d seconds = %02dh %02dm %02ds\n",minutes,seconds,hour,remainingMinutes,seconds);
             return hour+remainingMinutes+seconds; //for int/long return type
             */
            return minutes+" minutes and "+seconds+" seconds = "+hourString+":"+minuteString+":"+secondString+"";
        }
        else{
            //System.out.println("Invalid input");
            return "Invalid input";
        }
    }
    public static String getDurationString(int seconds){
        if(seconds>=0){
            int minutes=seconds/60;
            int remainingSeconds=seconds%60;
            //System.out.println(seconds+" seconds = "+minutes+" m "+remainingSeconds+" s");
            return getDurationString(minutes,remainingSeconds);
        }
        else {
            //System.out.println("Invalid input");
            return "Invalid input";
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int minutes,seconds,choice;
        System.out.println("-----------------------------Choose which method you want to use-----------------------------");
        System.out.println("1)Minutes & seconds to h:m:s\n2)Seconds to h:m:s");
        choice=in.nextInt();
        switch (choice){
            case 1:
                System.out.println("Enter minutes & seconds");
                minutes=in.nextInt();
                seconds=in.nextInt();
                System.out.println(getDurationString(minutes,seconds));
                break;
            case 2:
                System.out.println("Enter seconds");
                seconds=in.nextInt();
                System.out.printf(getDurationString(seconds));
                break;
            default:
                System.out.println("Invalid input");
        }
    }
}
