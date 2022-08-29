import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int total = 0, i;

        do {
            System.out.println("Enter number : ");
            i = inp.nextInt();

            if (i % 2 == 0 && i % 4 == 0) {

                total += i;

            }

        } while (i % 2 == 0);
        System.out.println("Total : " + total);
    }
}