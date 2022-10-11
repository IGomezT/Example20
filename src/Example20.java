import java.util.Scanner;

public class Example20 {

    public static void main(String[] argv) {
        int year;

        Scanner inputValue;
        inputValue = new Scanner(System.in);

        System.out.println("Write year");
        year = inputValue.nextInt();

        if(year % 4 == 0) {

        } else {
            System.out.println("Not a leap year");
        }
            if(year % 100 == 0) {

        } else {
                System.out.println("Leap year");
            }
            if(year % 400 == 0) {
                System.out.println("Leap year");

            }else {
                System.out.println("Not leap year");
            }

    }

}
