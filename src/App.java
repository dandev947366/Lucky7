import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bet = 5; 
        boolean reset = true;

        while (bet > 0 && reset) {
        
            int num1 = random();
            int num2 = random();
            int num3 = random();

            System.out.println("Random numbers: " + num1 + ", " + num2 + ", " + num3);

            int win = checkWin(num1, num2, num3);
            if (win > 0) {
                bet += win;
                System.out.println("You won $" + win);
            } else {
                bet -= 1; 
            
            }

            if (bet <= 0) {
                System.out.println("No more money. Game over!!!!");
                break;
            }

            System.out.print("You have $ " + bet + " " + "Play again? (y/n): ");
            String choice = scanner.next();
            

            if (choice.equals("y"))
            {reset = true;}
            else {reset=false;}
        }

      System.out.println("Thank you.");
        scanner.close();
    }

    public static int random() {
        Random rand = new Random();
        return rand.nextInt(10) + 1;
    }

    
    public static int checkWin(int num1, int num2, int num3) {
        if (num1 == 7 && num2 == 7 && num3 == 7) {
            return 10; 
        } else if (num1 == 7 || num2 == 7 || num3 == 7) {
            return 3; 
        } else if ((num1 == 7 && num2 == 7) || (num1 == 7 && num3 == 7) || (num2 == 7 && num3 == 7)) {
            return 5; 
        }
        return 0; 
    }
}
