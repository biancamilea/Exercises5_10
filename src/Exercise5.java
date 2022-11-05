import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList();

        for (int i = 1; i <= 10; i++) {
            System.out.println("Introduce number " + i);
            Integer number = scanner.nextInt();
            numbers.add(number);
        }
        for (int i = numbers.size() - 1;  i >= 0; i--) {
            System.out.print(numbers.get(i));
            System.out.print(" ");
        }
    }
}