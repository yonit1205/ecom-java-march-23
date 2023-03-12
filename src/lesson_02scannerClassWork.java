import java.util.Scanner;

public class lesson_02scannerClassWork {
    public static void main(String[] args) {



        Scanner input = new Scanner(System.in);

        System.out.println("what is your name? ");
        String myName = input.nextLine();

        System.out.println("what is your second name? ");
        String mySecondName = input.nextLine();

        System.out.println("what is your city? ");
        String myCity = input.nextLine();

        System.out.println("what is your age? ");
        int myAge = input.nextInt();

        System.out.println("what is your average grades? ");
double myAverage = input.nextDouble();

        System.out.println("myName = " + myName);
        System.out.println("mySecondName = " + mySecondName);
        System.out.println("myCity = " + myCity);
        System.out.println("myAge = " + myAge);
        System.out.println("myAverage = " + myAverage);

    }

}
