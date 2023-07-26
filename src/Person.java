import java.util.Scanner;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public void myAge(){

        Scanner scan = new Scanner(System.in);
        System.out.println("What is your age?");
        age = scan.nextInt();
        if(age > 18){
            System.out.println("You are an adult and are allowed to drink");
        } else {
            System.out.println("You are a minor and are not allowed to drink - Sorry not sorry");
        }

    }


}
