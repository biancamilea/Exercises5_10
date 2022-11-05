import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final char[] LETTERS = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};

        System.out.println("Introduce your DNI: ");
        int dni = scanner.nextInt();
        int rest = dni%23;
        char letter = LETTERS[rest];

        System.out.println("Your DNI letter is: " + letter);
    }
}