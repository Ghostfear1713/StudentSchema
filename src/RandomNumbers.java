import java.util.Random;

public class RandomNumbers {

    public void randomNumber(){
        Random random = new Random();
        //This will give a random number - To limit it, we write 6 within the parantese. NOTE: If we just write 6
        //within the parantese, it will take a number between 0-5 because the computer will always start at 0 - to prevent
        //this we add +1
        int x = random.nextInt(6)+1;
        double y = random.nextDouble();
        boolean z = random.nextBoolean();
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }



}
