import java.util.Scanner;

public class ConvertingFeetToCentimeter {
    public static double convertToCentimeter(double feet, double inches){
        if(feet<0 || inches<0 || inches>12) {
            System.out.println("Invalid input");
            return -1;
        }
        else{
            double centimeter=(feet*12)*2.54;
            centimeter+=inches*2.54;
            System.out.println(feet+" feet "+inches+" inches = "+centimeter+" centimeter");
            return centimeter;
        }
    }
    public static double convertToCentimeter(double inches){
        if(inches<0) {
            System.out.println("Invalid input");
            return -1;
        }
        else {
            double feet=(int)inches/12;
            double remainderInches=(int)inches%12;
            System.out.println(inches+" inches = "+feet+" feet and "+remainderInches+" inches");
            return convertToCentimeter(feet,remainderInches);
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int feet,inches;
        System.out.println("-----------------Choose which method you want to use-----------------");
        System.out.println("1)Feet & inches to centimeter\n2)Inch to centimeter");
        int choice=in.nextInt();
        switch (choice){
            case 1:
                System.out.println("Enter feet & inches:");
                feet=in.nextInt();
                inches=in.nextInt();
                convertToCentimeter(feet,inches);
                break;
            case 2:
                System.out.println("Enter inches:");
                inches=in.nextInt();
                convertToCentimeter(inches);
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}
