
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj wysokość trójkąta:");
        int height = scanner.nextInt();
        System.out.println("podaj szerokość trójkąta:");
        int width = scanner.nextInt();
        System.out.println("podaj pierwszy znak: ");
        char firstChar = scanner.next().charAt(0);
        System.out.println("podaj drugi znak: ");
        char secondChar = scanner.next().charAt(0);
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= width; j++) {
                if (j <= height - i) {
                    System.out.print("  "); 
                } else {
                    System.out.print((j % 2 == 0) ? secondChar + " " : firstChar + " ");
                }
            }
            System.out.println();
        }
    }
}