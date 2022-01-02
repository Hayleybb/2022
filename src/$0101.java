import java.util.Scanner;

public class $0101 {

   public static void main(String[] args) {
        System.out.println("Simple Calculator\n"
              +"1. Addition\n"
              +"2. Subtraction\n"
              +"3. Multiplication\n"
              +"4. Division\n"
              +"5. Remaining");
        System.out.print("Select operator : ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        if (num == 1 || num == 2 || num == 3 || num == 4 || num == 5) {        
            System.out.print("Enter two numbers : ");
            int score1 = in.nextInt();
            int score2 = in.nextInt();
            
            if (num == 1) {        
               System.out.printf("Answer : %d", score1+score2);
            } else if (num == 2) {
               System.out.printf("Answer : %d", score1-score2);
            } else if (num == 3) {
               System.out.printf("Answer : %d", score1*score2);
            } else if (num == 4) {
               System.out.printf("Answer : %d", score1/score2);
            } else if (num == 5) {
               System.out.printf("Answer : %d", score1%score2);
            } else {
               System.out.printf("Wrong Input");
            }
        } else {
           System.out.printf("Wrong Input");
        }
    }

}