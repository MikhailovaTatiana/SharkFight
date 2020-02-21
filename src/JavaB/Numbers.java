package JavaB;

import java.util.Scanner;

public class Numbers {
    int numbers;
    public int start() {
        System.out.println("\nSelect numbers of members in each team: 3, 4, 5 or 0 (close)");
        Scanner sc = new Scanner(System.in);
        numbers = sc.nextInt();
        if (numbers == 0) {
            System.out.println("EXIT");
        } else if (numbers >= 3 && numbers <= 5) {
            System.out.println("The game starts...\n");

        } else {
            System.out.println("Wrong choice! Try again!");
            start();
        }
        sc.close();
        return numbers;
    }
}
