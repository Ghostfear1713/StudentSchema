import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Scanner scan = new Scanner(System.in);
//        System.out.println("Hey there. What is your name?");
//        //Gives us the ability to save the name we write to the console
//        String name = scan.nextLine();
//        System.out.println("Hello there " + name + "! Pleasure to meet you!");
//        System.out.println("Write down your age as well");
//        if (scan.hasNextInt()) {
//            int age = scan.nextInt();
//            System.out.println("So you're " + age + " years old! That's pretty cool :)");
//        } else{
//            String input = scan.nextLine();
//            throw new InputMismatchException("Invalid input! Expected a number, but recieved " + input);
//        }
//        /*
//        System.out.println("What is your favorite food?");
//        String food = scan.nextLine();
//        In order for this code to be made, we need to reset the scan.nextLine - If we were to run the code now, it wouldn't
//        of been able to get this part because there is a nextInt after the nextLine and java doesn't know how to differentiate this
//        so it would skip this part. We then make a scan.nextLine again and should be free to run the code now
//        */
//        scan.nextLine();
//        System.out.println("What is your favorite food?");
//        String food = scan.nextLine();
//
//        System.out.println("Name: " + name + " ");


        GUI gui = new GUI();
        //gui.GuiFun();
        RandomNumbers randomNumbers = new RandomNumbers();
        //randomNumbers.randomNumber();
        Person person = new Person("Orhan", 27);
        person.myAge();



    }





}